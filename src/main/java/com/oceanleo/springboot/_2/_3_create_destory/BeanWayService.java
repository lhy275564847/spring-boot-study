package com.oceanleo.springboot._2._3_create_destory;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author haiyang.li
 */
public class BeanWayService {

    public BeanWayService() {
        System.out.println("BeanWayService---constructor");
    }

    public void init(){
        System.out.println("BeanWayService---init");
    }

    public void destroy(){
        System.out.println("BeanWayService---destroy");
    }

}
