package com.oceanleo.springboot._4._2_annotation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haiyang.li
 */
//这个注解表示Controller和ResponseBody两个注解同时使用
@RestController
@RequestMapping("/_2/rest")
public class DemoRestController {

    //返回数据格式为json
    @RequestMapping(value = "/getjson", produces = "application/json;charset=UTF-8")
    public DemoObj json(DemoObj demoObj) {
        return new DemoObj(demoObj.getId() + 1, demoObj.getName() + " json");
    }

    //返回数据格式为xml
    @RequestMapping(value = "/getxml", produces = "application/xml;charset=UTF-8")
    public DemoObj xml(DemoObj demoObj) {
        return new DemoObj(demoObj.getId() + 1, demoObj.getName() + " xml");
    }
}
