package com.kuwo.feign.controller;

import com.kuwo.feign.service.RpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liuaichao
 * @Date: 2019/5/9 19:15
 */
@RestController
public class FeignController {

    @Autowired
    RpcService rpcService;

    @GetMapping(value = "/test")
    public String sayHi() {
        return rpcService.test();
    }
}
