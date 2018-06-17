package com.oceanleo.springboot._3._2_executor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author haiyang.li
 */
@Service
//@Async   在类上面，表示类里面的所有方法都是异步方法
public class AsyncTaskService {

    //@Async表示这个方法是异步方法
    @Async
    public void executeAsyncTask(int i) {
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void executeAsyncTaskPlus(int i) {
        System.out.println("执行异步任务+1：" + i);
    }
}
