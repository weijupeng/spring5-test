package com.wjp.spring5.part.one.two.impl;

import com.wjp.spring5.part.one.two.ICourse;

/**
 * @author wjp
 * @date 2020/7/15 11:10
 */
public class JavaCourse implements ICourse {

    public void study() {
        System.out.println("Tom在学习Java的课程");
    }
}
