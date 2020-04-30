package com.teaching.teachingservices1.controller;

import com.teaching.teachingservices1.service.FeignService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RefreshScope
public class TestController {
    @Resource
    private FeignService feignService;
    @Value("${server.port}")
    private String port;
    @Value("${fileName}")
    private String fileName;
    @RequestMapping("/test2")
    public String sayHello(){
        System.out.println(port);
        System.out.println(fileName);
        return feignService.sayHello();
    }
}
