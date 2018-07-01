package com.oceanleo.springboot._5._2_properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author haiyang.li
 */
@Component
//加载配置文件里面的配置 prefix是配置文件里面的前缀
@ConfigurationProperties(prefix = "config.book")
public class BookConfig {

    private String name;

    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
