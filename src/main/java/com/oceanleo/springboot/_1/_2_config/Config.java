package com.oceanleo.springboot._1._2_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * configuration 注解配表示是一个spring的配置对象
 *
 * @author haiyang.li
 */
@Configuration
@ComponentScan("com.oceanleo.springboot._1._2_config")
public class Config {

    //bean注解表示方法返回的是一个bean对象
//    @Bean
//    public UseFunctionService createUseFunctionService(){
//        UseFunctionService useFunctionService = new UseFunctionService();
//        //设置bean里面的其它bean对象
//        useFunctionService.setFunctionService(createFunctionService());
//        return useFunctionService;
//    }

    //bean注解表示方法返回的是一个bean对象
    @Bean
    public UseFunctionService createUseFunctionService(FunctionService functionService){
        UseFunctionService useFunctionService = new UseFunctionService();
        //设置bean里面的其它bean对象
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }

    @Bean
    public FunctionService createFunctionService(){
        return new FunctionService();
    }
}
