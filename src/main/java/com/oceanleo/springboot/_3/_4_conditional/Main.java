package com.oceanleo.springboot._3._4_conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author haiyang.li
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        ListCommand listCommand = context.getBean(ListCommand.class);
        System.out.println(listCommand.list());

        context.close();
    }
}
