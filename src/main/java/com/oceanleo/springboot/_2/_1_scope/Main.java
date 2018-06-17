package com.oceanleo.springboot._2._1_scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author haiyang.li
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        DemoSingletonService demoSingletonService = context.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService2 = context.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService3 = context.getBean(DemoSingletonService.class);
        System.out.println(demoSingletonService);
        System.out.println(demoSingletonService2);
        System.out.println(demoSingletonService3);

        DemoPrototypeService demoPrototypeService = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService2 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService3 = context.getBean(DemoPrototypeService.class);
        System.out.println(demoPrototypeService);
        System.out.println(demoPrototypeService2);
        System.out.println(demoPrototypeService3);

        context.close();
    }
}
