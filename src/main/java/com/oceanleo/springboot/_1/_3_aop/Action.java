package com.oceanleo.springboot._1._3_aop;

import java.lang.annotation.*;

/**
 * 自定义aop的拦截注解
 *
 * @author haiyang.li
 */
//注解可以打在什么地方
@Target(ElementType.METHOD)
//注解保留到什么时候
@Retention(RetentionPolicy.RUNTIME)
//是否生成文档
@Documented
public @interface Action {
    //注解属性
    String name();
}
