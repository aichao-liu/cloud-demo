package com.kuwo.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: liuaichao
 * @Date: 2019/5/9 17:37
 */
@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    /**
     * @return
     */
    @HystrixCommand(fallbackMethod = "error")
    public String test() {
        //调用时通过ribbon能做到负载均衡，默认集成了ribbon
        return restTemplate.getForObject("http://provider/test", String.class);
    }

    public String error() {
        return "hi,sorry,error!";
    }

}
