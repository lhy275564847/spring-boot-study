package com.oceanleo.springboot._1._1_ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author haiyang.li
 */
//表示是一个spring容器的bean
@Service
public class UseFunctionService {

//    自动注入容器里面的其它Bean
    @Autowired
    private FunctionService functionService;

    public void sayHello(String str) {
        functionService.sayHello(str);
    }
}
