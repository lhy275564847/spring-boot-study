package com.oceanleo.springboot._4._2_annotation;

/**
 * @author haiyang.li
 */
public class DemoObj {

    private Long id;

    private String name;

    //jackson 在做对象和json转换的时候，一定需要一个空的构造
    public DemoObj() {
    }

    public DemoObj(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DemoObj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
