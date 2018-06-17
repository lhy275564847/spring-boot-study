package com.oceanleo.springboot._3._1_aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.*;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author haiyang.li
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware, BeanFactoryAware, ApplicationContextAware, MessageSourceAware, ApplicationEventPublisherAware {

    private String beanName;

    private ResourceLoader resourceLoader;

    private BeanFactory beanFactory;

    private ApplicationContext applicationContext;

    private ApplicationEventPublisher applicationEventPublisher;

    private MessageSource messageSource;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void show() {
        System.out.println(beanName);
        Resource resource = resourceLoader.getResource("classpath:com/oceanleo/springboot/_3/_1_aware/test.txt");
        try {
            System.out.println(IOUtils.toString(resource.getInputStream(), "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(beanFactory);
        System.out.println(applicationContext);
        System.out.println(applicationEventPublisher);
        System.out.println(messageSource);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
}
