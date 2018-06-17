package com.oceanleo.springboot._3._3_scheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author haiyang.li
 */
@Configuration
@ComponentScan("com.oceanleo.springboot._3._3_scheduled")
//开启对调度支持
@EnableScheduling
public class Config {

}
