package com.wjp.spring5.part.one.one.impl;

import com.wjp.spring5.part.one.one.ICourse;
import lombok.Data;

/**
 * @author wjp
 * @date 2020/7/15 11:00
 */
@Data
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
