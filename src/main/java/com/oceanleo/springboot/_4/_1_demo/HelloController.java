package com.oceanleo.springboot._4._1_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author haiyang.li
 */
@Controller
@RequestMapping("/_1")
public class HelloController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
