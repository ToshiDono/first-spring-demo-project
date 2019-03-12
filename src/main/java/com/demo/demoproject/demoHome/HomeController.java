package com.demo.demoproject.demoHome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping("/toshi")
    String helloAnton() {
        return "Hello Anton!";
    }

    @RequestMapping("/bla")
    String bla() {
        return "Bla bla!";
    }

}
