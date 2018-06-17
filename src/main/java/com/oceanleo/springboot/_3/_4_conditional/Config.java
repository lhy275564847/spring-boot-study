package com.oceanleo.springboot._3._4_conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author haiyang.li
 */
@Configuration
@ComponentScan("com.oceanleo.springboot._3._4_conditional")
public class Config {

    //Conditional 判断的条件 返回一个Boolean值
    @Bean
    @Conditional(ConditionalWindow.class)
    public ListCommand window() {
        return new ListCommandWindow();
    }

    //如果两个都不满足，返回null，两个都满足，报异常
    @Bean
    @Conditional(ConditionalLinux.class)
    public ListCommand linux() {
        return new ListCommandLinux();
    }
}
