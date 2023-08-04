package com.example.dubbo.dubboProdiver;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.example.dubbo.dubboProdiver.service.impl")
public class DubboProdiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProdiverApplication.class, args);
    }

}
