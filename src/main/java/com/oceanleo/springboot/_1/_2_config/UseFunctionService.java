package com.oceanleo.springboot._1._2_config;

/**
 * @author haiyang.li
 */
public class UseFunctionService {

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public void sayHello(String str) {
        functionService.sayHello(str);
    }
}
