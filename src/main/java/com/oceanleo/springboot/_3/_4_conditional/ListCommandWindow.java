package com.oceanleo.springboot._3._4_conditional;

/**
 * @author haiyang.li
 */
public class ListCommandWindow implements ListCommand {

    @Override
    public String list() {
        return "dir";
    }
}
