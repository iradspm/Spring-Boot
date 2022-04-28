/*Spring MVC controller class*/
package com.irad.projects.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //annotate the controller class
public class WebController {

    //hello mapping page
    @RequestMapping("/hello")
    public String sayHello(Model model)//pass model attributes using model class in spring
    {
        System.out.println("Saying Hello world spring boot");
        model.addAttribute("message","Greetings from Iradspm");
        return "Hello"; //requires Hello.html file
    }
}
