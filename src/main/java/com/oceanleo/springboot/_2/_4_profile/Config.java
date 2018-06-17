package com.oceanleo.springboot._2._4_profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author haiyang.li
 */
@Configuration
@ComponentScan("com.oceanleo.springboot._2._4_profile")
public class Config {

    //设置开发环境 当profile为develop时候，返回这个bean
    @Bean
    @Profile("develop")
    public DemoBean createBeanWayService() {
        return new DemoBean("develop bean");
    }

    //设置生产环境 当profile为product时候，返回这个bean
    @Bean
    @Profile("product")
    public DemoBean createJsr250WayService() {
        return new DemoBean("product bean");
    }
}
