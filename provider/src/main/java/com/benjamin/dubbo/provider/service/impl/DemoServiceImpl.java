package com.benjamin.dubbo.provider.service.impl;

import com.benjamin.dubbo.service.IDemoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author Ben.Li
 * @date 2022/1/31 上午11:29
 */
@Service
@Component
public class DemoServiceImpl implements IDemoService {

    @Override
    public String sayHello(String name) {
        return "您好：" + name;
    }
}
