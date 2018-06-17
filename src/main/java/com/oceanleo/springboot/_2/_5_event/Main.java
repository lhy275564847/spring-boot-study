package com.oceanleo.springboot._2._5_event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author haiyang.li
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.oceanleo.springboot._2._5_event.Config.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

        DemoPublisher2 demoPublisher2 = context.getBean(DemoPublisher2.class);

        //从发送到接收消息，在同一个事物里面，有异常会回滚，发送消息后面的代码会在接受完毕后才执行
        demoPublisher.publisher(new DemoEvent("这是消息内容......"));

        demoPublisher2.publisher(new DemoEvent("这是消息内容......"));

        context.close();
    }
}
