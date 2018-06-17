package com.oceanleo.springboot._1._2_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author haiyang.li
 */
public class Main {

    public static void main(String[] args) {
        //注解配置扫描，作为spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        //获取容器里面的bean
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        useFunctionService.sayHello("Spring Boot");
        context.close();
    }
}
