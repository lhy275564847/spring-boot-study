package com.oceanleo.springboot._5._4_myconfig;

import com.oceanleo.springboot.config.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//控制层
@RestController
//核心注解 开户自动配置
@SpringBootApplication
public class MyConfigApplication {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    public String hello() {
        return helloService.sayHello();
//        return "<h1>Hello Spring Boot !</h1>";
    }

    //程序入口
    public static void main(String[] args) {
        SpringApplication.run(MyConfigApplication.class, args);
    }
}
