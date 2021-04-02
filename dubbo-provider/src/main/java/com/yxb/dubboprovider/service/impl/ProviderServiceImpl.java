package com.yxb.dubboprovider.service.impl;

import com.yxb.dubborpc.ProviderService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author yxb
 * @since 2021.3.1
 */

@DubboService(version = "1.0.0", interfaceClass = ProviderService.class)
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello() {
        return "hello dubbo";
    }
}
