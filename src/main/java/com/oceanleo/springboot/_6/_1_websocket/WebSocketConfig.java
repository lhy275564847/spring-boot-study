package com.oceanleo.springboot._6._1_websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author haiyang.li
 */
public class WebSocketConfig extends WebMvcConfigurerAdapter {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        //路径和页面映射
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //前缀
        viewResolver.setPrefix("/WEB-INF/classes/views");
        //后缀
        viewResolver.setSuffix(".jsp");
        //视图转换器
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }
}
