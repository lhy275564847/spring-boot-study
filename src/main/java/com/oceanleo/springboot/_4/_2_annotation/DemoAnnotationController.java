package com.oceanleo.springboot._4._2_annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author haiyang.li
 */
@Controller
//父请求路径
@RequestMapping("/_2/anno")
public class DemoAnnotationController {

    //没有路径，默认为/  produces 可以定制返回的response类型和字符集
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String index(HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access ";
    }

    @RequestMapping(value = "/pathVar/{str}", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String demoPathVariable(@PathVariable String str, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access,str:" + str;
    }

    @RequestMapping(value = "/requestParams", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String requestParams(Long id, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access,id:" + id;
    }

    //返回的response类型和字符集为json
    @RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String passObj(DemoObj demoObj, HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access," + demoObj;
    }

    @RequestMapping(value = {"/name1","/name2"}, produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String remove(HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access";
    }
}
