package com.oceanleo.springboot._4._3_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

///**
// * @author haiyang.li
// */
//@Configuration
////注解会开启一些默认配置，如ViewResolver和MessageConverter
//@EnableWebMvc
//@ComponentScan("com.oceanleo.springboot._4")
//public class MvcConfig extends WebMvcConfigurerAdapter {
//
//    @Bean
//    public InternalResourceViewResolver viewResolver() {
//        //路径和页面映射
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        //前缀
//        viewResolver.setPrefix("/WEB-INF/classes/views/_4/");
//        //后缀
//        viewResolver.setSuffix(".jsp");
//        //视图转换器
//        viewResolver.setViewClass(JstlView.class);
//        return viewResolver;
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        //静态资源文件的映射
//        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
//    }
//}

