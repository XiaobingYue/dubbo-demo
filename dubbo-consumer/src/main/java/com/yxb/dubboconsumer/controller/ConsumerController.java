package com.yxb.dubboconsumer.controller;

import com.yxb.dubborpc.ProviderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yxb
 * @since 2021.3.1
 */

@RestController
public class ConsumerController {

    @DubboReference(version = "1.0.0")
    private ProviderService providerService;


    @GetMapping("/sayHello")
    public String sayHello() {
        return providerService.sayHello();
    }
}
