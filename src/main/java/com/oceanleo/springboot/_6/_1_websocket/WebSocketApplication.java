package com.oceanleo.springboot._6._1_websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//控制层
@RestController
//核心注解 开户自动配置
@SpringBootApplication
public class WebSocketApplication {

    @RequestMapping("/")
    public String hello() {
        return "<h1>Hello Spring Boot !</h1>";
    }

    //程序入口
    public static void main(String[] args) {
        SpringApplication.run(WebSocketApplication.class, args);
    }
}
