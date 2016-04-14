package cz.zjor.embedded.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

//    @Inject
//    private GreetService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        return "hello world";
    }

//    @RequestMapping(value = "/greet", method = RequestMethod.GET)
//    @ResponseBody
//    public String greet(@RequestParam("name") String name) {
//        return service.greet(name);
//    }

}
