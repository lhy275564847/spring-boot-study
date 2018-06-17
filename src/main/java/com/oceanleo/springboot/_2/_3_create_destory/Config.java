package com.oceanleo.springboot._2._3_create_destory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author haiyang.li
 */
@Configuration
@ComponentScan("com.oceanleo.springboot._2._3_create_destory")
public class Config {

    //spring bean的初始化和销毁
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BeanWayService createBeanWayService() {
        return new BeanWayService();
    }

    //jsr250的初始化和销毁
    @Bean
    public Jsr250WayService createJsr250WayService() {
        return new Jsr250WayService();
    }
}
