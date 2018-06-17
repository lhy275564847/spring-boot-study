package com.oceanleo.springboot._2._4_profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author haiyang.li
 */
public class Main {

    public static void main(String[] args) {
        //不能在创建容器的时候注册配置文件
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //修改活动为product
        context.getEnvironment().setActiveProfiles("product");
        //注册bean配置类
        context.register(Config.class);
        //刷新容器
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        context.close();
    }
}
