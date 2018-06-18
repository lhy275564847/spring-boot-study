package com.oceanleo.springboot._4._5_advice;

import com.oceanleo.springboot._4._2_annotation.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haiyang.li
 */
@Controller
@RequestMapping("/_5")
public class AdviceController {

    @RequestMapping("/advice")
    @ResponseBody
    public String advice(@ModelAttribute("msg") String msg, DemoObj demoObj) {
        System.out.println(demoObj);
        throw new IllegalArgumentException("参数有误:@ModelAttribute" + msg);
    }
}
