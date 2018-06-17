package com.oceanleo.springboot._3._5_annotation;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author haiyang.li
 */
@Service
public class DemoService {

    public void annotation() {
        System.out.println("组合注解生成的bean");
    }
}
