package com.oceanleo.springboot._1._3_aop;

import org.springframework.stereotype.Service;

/**
 * @author haiyang.li
 */

@Service
public class DemoMethodService {

    public void add(){
        System.out.println("DemoMethodService--------");
    }
}
