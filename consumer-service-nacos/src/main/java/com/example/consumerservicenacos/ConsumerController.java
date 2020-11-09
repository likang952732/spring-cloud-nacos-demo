package com.example.consumerservicenacos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 @Description
 *@author kang.li
 *@date 2020/11/6 11:20   
 */
@RestController
public class ConsumerController {
    /**
     * 动态代理对象，内部远程调用服务生产者
     */
    @Autowired
    private ProviderClient providerClient;

    @GetMapping("/service")
    public String service(){
        String service = providerClient.service();
        return "comsumer invoke "+"|"+ service;
    }
}
