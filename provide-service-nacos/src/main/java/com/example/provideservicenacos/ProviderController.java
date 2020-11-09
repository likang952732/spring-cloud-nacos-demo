package com.example.provideservicenacos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 @Description
 *@author kang.li
 *@date 2020/11/6 11:09   
 */
@RestController
public class ProviderController {

    @GetMapping("/service")
    public String service(){
        System.out.println("nacos provider invoke");
        return "provider invoke";
    }
}
