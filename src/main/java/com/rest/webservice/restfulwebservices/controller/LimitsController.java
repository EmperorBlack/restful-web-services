package com.rest.webservice.restfulwebservices.controller;

import com.rest.webservice.restfulwebservices.beans.Limits;
import com.rest.webservice.restfulwebservices.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retriveLimit(){
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }
}
