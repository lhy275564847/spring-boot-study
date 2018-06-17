package com.oceanleo.springboot._3._2_executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author haiyang.li
 */
@Configuration
@ComponentScan("com.oceanleo.springboot._3._2_executor")
//开启异步任务支持
@EnableAsync
public class Config implements AsyncConfigurer {

    @Override
    public Executor getAsyncExecutor() {
        //初始化线程池
        ThreadPoolTaskExecutor threadPoolTaskExecutor= new ThreadPoolTaskExecutor();
        //线程池最大线程数
        threadPoolTaskExecutor.setMaxPoolSize(10);
        //核心线程池大小，默认为1
        threadPoolTaskExecutor.setCorePoolSize(5);
        //设置ThreadPoolExecutor的阻塞队列的容量。
        threadPoolTaskExecutor.setQueueCapacity(25);
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;

    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
