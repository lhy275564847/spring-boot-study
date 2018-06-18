package com.oceanleo.springboot._4._4_interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author haiyang.li
 */
//实现适配器，自定义拦截器
public class DemoInterceptor extends HandlerInterceptorAdapter {

    //重写方法，在请求之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long millis = System.currentTimeMillis();
        request.setAttribute("startTime", millis);
        return super.preHandle(request, response, handler);
    }

    //重写方法，在请求之后执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        Long startTime = (Long) request.getAttribute("startTime");
        request.removeAttribute("startTime");

        Long endTime = System.currentTimeMillis();
        System.out.println("本次请求时间为：" + (endTime - startTime) + " ms");
        request.setAttribute("handlerTime", endTime - startTime);
        super.postHandle(request, response, handler, modelAndView);
    }
}
