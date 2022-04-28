/*creating rest controller for services*/
package com.irad.projects.hellospringboot.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServicesController {

    @GetMapping("/rest")//Get mapping is a rest controller for 'get', post mapping for 'post' etc
    public String sayRest()
    {
        return "Great, let's take a rest with spring boot!";
    }
}
