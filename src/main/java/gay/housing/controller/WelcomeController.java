package gay.housing.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.util.Map;

import gay.housing.sendgrid.LGBTEmails;

import gay.housing.model.Users;
import gay.housing.service.UsersService;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.sql.DataSource;

@Controller
public class WelcomeController {


    @Autowired(required = true)
    private UsersService usersService;

    @Autowired(required = true)
    private SessionFactory sessionFactory;

    @Autowired(required = true)
    DataSource dataSource;


    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @GetMapping("/")
    public String welcome(Map<String, Object> model) throws java.lang.Exception, java.sql.SQLException {

        LGBTEmails lgbtEmails = new LGBTEmails();
        lgbtEmails.testEmail();


        Connection connection;
        Statement statement;
        ResultSet resultSet;
        connection = dataSource.getConnection();
        statement = connection.createStatement();
        statement.setQueryTimeout(15);
        resultSet = statement.executeQuery("SELECT * from users where user_id = 1");
        while(  resultSet.next() ) {
            System.out.println("There was something in result set");
            System.out.println(resultSet.getString(5));
        }
        System.out.println("Starting call");


        Users user = usersService.get(new Integer(1));
        System.out.println("Finished user service" + user.getFirst_name());
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/login")
    public String login(Map<String,Object> model) {

        return "mat_login";
//        return "login";
    }

    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }

}