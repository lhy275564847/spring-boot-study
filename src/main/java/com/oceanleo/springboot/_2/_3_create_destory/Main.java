package com.oceanleo.springboot._2._3_create_destory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author haiyang.li
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        context.getBean(BeanWayService.class);

        context.getBean(Jsr250WayService.class);

        context.close();
    }
}
