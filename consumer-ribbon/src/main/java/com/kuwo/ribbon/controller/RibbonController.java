package com.kuwo.ribbon.controller;

import com.kuwo.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liuaichao
 * @Date: 2019/5/18 17:51
 */
@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;

    @GetMapping(value = "/test")
    public String hi() {
        return ribbonService.test();
    }
}
