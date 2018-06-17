package com.oceanleo.springboot._1._3_aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * configuration 注解配表示是一个spring的配置对象
 *
 * @author haiyang.li
 */
@Configuration
@ComponentScan("com.oceanleo.springboot._1._3_aop")
//启动代理支持
@EnableAspectJAutoProxy
public class Config {

}
