package com.oceanleo.springboot._2._5_event;

import org.springframework.context.ApplicationEvent;

/**
 * @author haiyang.li
 */
public class DemoEvent extends ApplicationEvent {

    private String content;

    public DemoEvent(String content) {
        super(content);
        this.content = content;
    }

    public DemoEvent(Object source, String content) {
        super(source);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "DemoEvent{" +
                "content='" + content + '\'' +
                '}';
    }
}
