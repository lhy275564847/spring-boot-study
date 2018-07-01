package com.oceanleo.springboot._5._2_properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//控制层
@RestController
//核心注解 开户自动配置
@SpringBootApplication
//引入其它xml配置文件
@ImportResource({"classpath:com/oceanleo/springboot/_5/_2_properties/spring-core.xml"})
public class PropertiesApplication {

    //直接读取 application.properties 文件的配置
//    @Value("${book.name}")
//    private String name;
//    @Value("${book.author}")
//    private String author;

    @Autowired
    private BookConfig bookConfig;

    @RequestMapping("/")
    public String hello() {
        return "<h1>Hello " + bookConfig.getName() + " !</h1><br/><h2>author:" + bookConfig.getAuthor() + "</h2>";
    }

    //程序入口
    public static void main(String[] args) {
        SpringApplication.run(PropertiesApplication.class, args);
    }
}
