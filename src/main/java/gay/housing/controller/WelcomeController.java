package gay.housing.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import java.util.Map;

import gay.housing.model.Users;
import gay.housing.service.UsersService;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gay.housing.PersistenceConfig;

import javax.sql.DataSource;
import javax.swing.plaf.nimbus.State;

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

        System.out.println("\nInside the Controller\n");

        Connection connection;
        Statement statement;
        ResultSet resultSet;
            connection = dataSource.getConnection();
            if (!connection.isValid(10)) {
                throw new Exception("Unable to connect to database");
            }
            System.out.println("Successfully connected to "
                    + connection.getMetaData().getDatabaseProductName());
            System.out.println((connection.isValid(8) ? "Valid Connection" : "Not Working"));
        System.out.println(connection.getMetaData().toString());
        System.out.println(connection.getCatalog());
        System.out.println(connection.isClosed());

        statement = connection.createStatement();

        statement.setQueryTimeout(15);
        resultSet = statement.executeQuery("SELECT * from users where user_id = 2");
        while(  resultSet.next() ) {
            System.out.println("There was something in result set");
            System.out.println(resultSet.getString(5));
            System.out.println(resultSet.getString(4));
            System.out.println(resultSet.getString(3));
            System.out.println(resultSet.getString(2));
        }
//            Users users = resultSet.
            System.out.println("\nuser value last name is " + resultSet.getFetchSize());


        //        Users user = usersService.get(new Integer(1));
//        Users test = usersService.get(1);
//        System.out.println("user name is :" + test.getDisplay_name());

        model.put("time", new Date());
//        model.put("message", user.getLast_name());
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }

}