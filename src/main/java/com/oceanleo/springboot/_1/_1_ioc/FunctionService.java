package com.oceanleo.springboot._1._1_ioc;

import org.springframework.stereotype.Service;

/**
 * @author haiyang.li
 */
@Service
public class FunctionService {

    public void sayHello(String str) {
        System.out.println("Hello " + str);
    }
}
