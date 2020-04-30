package com.teaching.teachingservices1.service.fallback;

import com.teaching.teachingservices1.service.FeignService;
import org.springframework.stereotype.Service;

@Service
public class FeignFallBackConfig implements FeignService {
    @Override
    public String sayHello() {
        return "对不起，熔断了";
    }
}
