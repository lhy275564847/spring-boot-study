package com.oceanleo.springboot._2._1_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author haiyang.li
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
