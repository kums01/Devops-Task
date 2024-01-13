package com.devops.dockertutorial;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Helloworld {
    @RequestMapping("/v1")
    public String hello(){
        return "Hello! Welcome to Dev Ops Automation :)";
    }
    
}
