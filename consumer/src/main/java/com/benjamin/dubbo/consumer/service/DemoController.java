package com.benjamin.dubbo.consumer.service;

import com.benjamin.dubbo.service.IDemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ben.Li
 * @date 2022/1/31 上午11:46
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Reference
    private IDemoService demoService;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam(value = "name") String name) {
        return demoService.sayHello(name);
    }
}
