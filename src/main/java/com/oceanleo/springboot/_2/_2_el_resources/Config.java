package com.oceanleo.springboot._2._2_el_resources;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * @author haiyang.li
 */
@Configuration
@ComponentScan("com.oceanleo.springboot._2._2_el_resources")
@PropertySource("classpath:com/oceanleo/springboot/_2/_2_el_resources/test.properties")
public class Config {

    //常用字段属性值
    @Value("I Love You")
    private String normal;

    //系统属性值
    @Value("#{systemProperties['os.name']}")
    private String osName;

    //随机数
    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    //其它类里面的属性
    @Value("#{demoService.another}")
    private String fromAnother;

    //资源文件
    @Value("classpath:com/oceanleo/springboot/_2/_2_el_resources/test.txt")
    private Resource testFile;

    //请求的返回结果
    @Value("http://www.baidu.com")
    private Resource url;

    //配置文件属性
    @Value("${book.name}")
    private String bookName;

    //容器的资源环境
    @Autowired
    private Environment environment;

    //要使用@value注入，必须使用一个PropertySourcesPlaceholderConfigurer的对象
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResources() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream(), "UTF-8"));
            System.out.println(IOUtils.toString(url.getInputStream(), "UTF-8"));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
