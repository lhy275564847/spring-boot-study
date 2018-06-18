package com.oceanleo.springboot._4._5_advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author haiyang.li
 */
//控制器建言 已经组合了component注解
@ControllerAdvice
public class ExceptionHandlerAdvice {

    //定义全局处理 value定义过滤条件
    @ExceptionHandler(Exception.class)
    public ModelAndView exception(Exception e, WebRequest request) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage", e.getMessage() + "Exception");
        return modelAndView;
    }

    //定义全局处理 value定义过滤条件
    @ExceptionHandler(IllegalArgumentException.class)
    public ModelAndView argumentException(Exception e, WebRequest request) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage", e.getMessage() + " ArgumentException");
        return modelAndView;
    }

    //添加全局键值对数据，所有注解的RequestMapping的方法可以获取这个值
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("msg", "其它的消息");
    }

    //忽略request参数的id
    @InitBinder
    public void InitBinder(WebDataBinder webDataBinder) {
        webDataBinder.setDisallowedFields("id");
    }
}
