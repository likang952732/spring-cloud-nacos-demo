package com.example.provideservicenacos;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 @Description
 *@author kang.li
 *@date 2020/11/6 11:09   
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ProviderController {
    @Value("${rsa.publicKey}")
    private String publicKey;

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @GetMapping("/get")
    public String get(){
        return "provider invoke/" + useLocalCache;
    }

    @GetMapping("/service")
    public String service(){
        return "provider invoke/" + publicKey;
    }
}
