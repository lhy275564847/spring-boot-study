package com.oceanleo.springboot._2._5_event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author haiyang.li
 */
@Component
public class DemoPublisher {

    @Autowired
    private ApplicationContext applicationContext;

    public void publisher(DemoEvent demoEvent) {
        System.out.println("发送消息开始===");
        System.out.println("发送消息内容：" + demoEvent.getContent());
        applicationContext.publishEvent(demoEvent);
        System.out.println("发送消息完成===");
    }
}
