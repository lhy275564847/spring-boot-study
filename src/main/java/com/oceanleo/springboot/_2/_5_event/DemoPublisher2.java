package com.oceanleo.springboot._2._5_event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @author haiyang.li
 */
//实现事件发布接口
@Component
public class DemoPublisher2 implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    public void publisher(DemoEvent demoEvent) {
        System.out.println("发送消息开始===");
        System.out.println("发送消息内容：" + demoEvent.getContent());
        applicationEventPublisher.publishEvent(demoEvent);
        System.out.println("发送消息完成===");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
