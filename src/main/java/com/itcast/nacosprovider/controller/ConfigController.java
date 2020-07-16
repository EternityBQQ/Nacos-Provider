package com.itcast.nacosprovider.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ConfigController {
    @NacosValue(value = "${test_username:123}", autoRefreshed = true)
    private String username;

    @GetMapping("/info")
    public String get() {
        return username;
    }
}
