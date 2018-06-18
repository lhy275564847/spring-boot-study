package com.oceanleo.springboot._4._7_converter;

import com.oceanleo.springboot._4._2_annotation.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author haiyang.li
 */
@Controller
@RequestMapping("/_7")
public class ConverterController {

    @RequestMapping(value = "/converter", produces = "application/x-wisely")
    @ResponseBody
    public DemoObj converter(@RequestBody DemoObj demoObj) {
        return demoObj;
    }
}
