package com.oceanleo.springboot._2._2_el_resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author haiyang.li
 */
@Service
public class DemoService {

    @Value("其它类的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
