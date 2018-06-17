package com.oceanleo.springboot._3._3_scheduled;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author haiyang.li
 */
@Service
public class ScheduledTaskService {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //每5秒执行一次
    @Scheduled(fixedRate = 5000)
    public void fixedRate() {
        System.out.println("fixedRate:" + simpleDateFormat.format(new Date()));
    }

    //每1分钟执行一次
    @Scheduled(cron = "0 0/1 * 1/1 * ?")
    public void cron() {
        System.out.println("cron:" + simpleDateFormat.format(new Date()));
    }
}
