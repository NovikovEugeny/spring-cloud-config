package com.example.springcloudclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${info.text}")
    private String message;

    @Value("${db.password}")
    private String pswd;

    @GetMapping("/messages")
    public String getMessage() {
        return message;
    }

    @GetMapping("/pswd")
    public String getPassword() {
        return pswd;
    }
}
