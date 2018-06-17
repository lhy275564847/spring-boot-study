package com.oceanleo.springboot._2._1_scope;

import org.springframework.stereotype.Service;

/**
 * @author haiyang.li
 */
@Service
//默认singleton 相当于@Scope("singleton")
/**
 * scope有5个配置：默认singleton
 * prototype 多例
 * request 一个请求创建一个
 * session 一个session创建一个
 * globalSession 全局session创建一个
 */
public class DemoSingletonService {

}
