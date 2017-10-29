package gay.housing.controller;

import java.util.Date;
import java.util.Map;

import gay.housing.model.Users;
import gay.housing.service.UsersService;
import gay.housing.service.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @Autowired(required = true)
    private UsersService usersService;

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {

        System.out.println("\nInside the Controller\n");

        Users test = usersService.get(1);
        System.out.println("user name is :" + test.getDisplay_name());

        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }

}