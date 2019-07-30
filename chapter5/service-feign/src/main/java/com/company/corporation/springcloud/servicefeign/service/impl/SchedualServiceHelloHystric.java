package com.company.corporation.springcloud.servicefeign.service.impl;

import com.company.corporation.springcloud.servicefeign.service.SchedualServiceHello;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHelloHystric implements SchedualServiceHello {

    @Override
    public String sayHelloFromClientOne(String name) {
        return "Sorry, " + name;
    }
}
