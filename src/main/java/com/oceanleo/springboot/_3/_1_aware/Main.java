package com.oceanleo.springboot._3._1_aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author haiyang.li
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        AwareService awareService = context.getBean(AwareService.class);
        awareService.show();

        context.close();
    }
}
