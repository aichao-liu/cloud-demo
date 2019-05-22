package com.kuwo.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: liuaichao
 * @Date: 2019/5/18 16:43
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "/test")
    public String test() {
        return "post is " + port;
    }
}
