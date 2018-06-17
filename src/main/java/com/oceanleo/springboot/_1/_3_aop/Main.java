package com.oceanleo.springboot._1._3_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author haiyang.li
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoMethodService.add();

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        demoAnnotationService.add();

        context.close();
    }
}
