package com.company.corporation.springcloud.serviceribbon.controller;

import com.company.corporation.springcloud.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "hi")
    public String hi(@RequestParam String name) {
        return helloService.helloService(name);
    }


}