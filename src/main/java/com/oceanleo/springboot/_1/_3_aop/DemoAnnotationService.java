package com.oceanleo.springboot._1._3_aop;

import org.springframework.stereotype.Service;

/**
 * @author haiyang.li
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解拦截add操作")
    public void add() {
        System.out.println("DemoAnnotationService----------");
    }

    @Action(name = "注解拦截add操作")
    public void add2() {
        System.out.println("DemoAnnotationService----------");
    }
}
