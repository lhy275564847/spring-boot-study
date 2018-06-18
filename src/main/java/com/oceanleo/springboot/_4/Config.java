package com.oceanleo.springboot._4;

import com.oceanleo.springboot._4._4_interceptor.DemoInterceptor;
import com.oceanleo.springboot._4._7_converter.DemoMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

/**
 * @author haiyang.li
 */
@Configuration
//注解会开启一些默认配置，如ViewResolver和MessageConverter
@EnableWebMvc
@ComponentScan("com.oceanleo.springboot._4")
//继承后可以重新复写方法对Mvc配置
public class Config extends WebMvcConfigurerAdapter {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        //路径和页面映射
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        //前缀
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        //后缀
        viewResolver.setSuffix(".jsp");
        //视图转换器
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

    //拦截器
    @Bean
    public DemoInterceptor interceptor() {
        return new DemoInterceptor();
    }

    //消息转换器
    @Bean
    public DemoMessageConverter converter(){
        return new DemoMessageConverter();
    }

    //添加到mvc
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(converter());
    }

    //文件上传配置
    @Bean
    public MultipartResolver multipartResolver() {
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setMaxUploadSize(1024 * 1024);
        return commonsMultipartResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //静态资源文件的映射
        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
    }

    //注册自定义拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor());
    }
}
