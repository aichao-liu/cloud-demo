package com.kuwo.feign.service;

import org.springframework.stereotype.Component;

/**
 * @Author: liuaichao
 * @Date: 2019/5/20 10:57
 */
@Component
public class RpcServiceHystrix implements RpcService {
    @Override
    public String test() {
        return "sorry, error!";
    }
}
