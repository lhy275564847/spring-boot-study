package com.oceanleo.springboot._3._5_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author haiyang.li
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        DemoService demoService = context.getBean(DemoService.class);
        demoService.annotation();

        context.close();
    }
}
