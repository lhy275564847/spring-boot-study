package com.oceanleo.springboot._4;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author haiyang.li
 */
//WebApplicationInitializer 是spring用来配置servlet的配置接口，代替了web.xml
public class WebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(Config.class);
        //创建web窗口，并和servletContext窗口关联
        webApplicationContext.setServletContext(servletContext);

        //注册mvc的dispatcher分发器
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(webApplicationContext));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
