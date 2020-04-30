package com.gateway.teachinggateway;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackConfig {

    @GetMapping(value = "/fallBack")
    public String fallback(){
        return "我是熔断,我进行了熔断";
    }
}
