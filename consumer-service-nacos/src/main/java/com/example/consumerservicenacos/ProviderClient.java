package com.example.consumerservicenacos;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/*
 @Description
 *@author kang.li
 *@date 2020/11/6 11:19   
 */
@FeignClient(value = "provide-service")
public interface ProviderClient {
    /**
     * 调用服务的方法
     * @return
     */
    @GetMapping("/service")
    public String service();
}
