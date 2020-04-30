package com.teaching.teachingservices1.service;

import com.teaching.teachingservices1.service.fallback.FeignFallBackConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "teaching-services",fallback = FeignFallBackConfig.class)
public interface FeignService {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String sayHello();
}
