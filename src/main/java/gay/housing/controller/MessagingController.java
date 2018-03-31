package gay.housing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/messagingApi")
public class MessagingController {


    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody String sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return Long.toString(counter.incrementAndGet());
    }


    @RequestMapping(method=RequestMethod.GET,value="/nextPath")
    public @ResponseBody String sayHelloAgain(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return "this is the next path";
    }


}
