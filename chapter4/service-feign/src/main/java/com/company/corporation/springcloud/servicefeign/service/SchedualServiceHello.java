package com.company.corporation.springcloud.servicefeign.service;

import com.company.corporation.springcloud.servicefeign.service.impl.SchedualServiceHelloHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = SchedualServiceHelloHystric.class)
public interface SchedualServiceHello {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}
