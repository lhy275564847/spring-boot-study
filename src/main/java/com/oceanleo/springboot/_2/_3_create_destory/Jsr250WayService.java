package com.oceanleo.springboot._2._3_create_destory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author haiyang.li
 */
public class Jsr250WayService {

    public Jsr250WayService() {
        System.out.println("Jsr250WayService---constructor");
    }

    //构造函数执行后执行的方法
    @PostConstruct
    public void init() {
        System.out.println("Jsr250WayService---init");
    }

    //bean销毁之前执行的方法
    @PreDestroy
    public void destroy() {
        System.out.println("Jsr250WayService---destroy");
    }
}
