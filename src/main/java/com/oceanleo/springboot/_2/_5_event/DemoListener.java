package com.oceanleo.springboot._2._5_event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author haiyang.li
 */
//需要注册成bean 事件监听接口
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println("接收消息开始---");
        System.out.println("消息内容:" + demoEvent.getContent());
        System.out.println("接收消息完成---");
    }
}
