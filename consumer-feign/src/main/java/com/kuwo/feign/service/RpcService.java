package com.kuwo.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: liuaichao
 * @Date: 2019/5/9 19:12
 */
@FeignClient(value = "provider", fallback = RpcServiceHystrix.class)
public interface RpcService {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String test();
}
