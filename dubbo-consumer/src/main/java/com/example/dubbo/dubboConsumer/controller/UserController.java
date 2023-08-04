package com.example.dubbo.dubboConsumer.controller;

import com.example.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @DubboReference(interfaceClass = UserService.class, id = "userService", version = "1.0.1")
    UserService userService;

    @GetMapping("/dubboTest")
    public void testDubbo() {
        System.out.println(userService.queryById(1));
    }

}
