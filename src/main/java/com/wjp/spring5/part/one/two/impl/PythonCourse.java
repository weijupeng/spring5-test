package com.wjp.spring5.part.one.two.impl;

import com.wjp.spring5.part.one.two.ICourse;

/**
 * @author wjp
 * @date 2020/7/15 11:11
 */
public class PythonCourse implements ICourse {
    public void study() {
        System.out.println("Tom在学习Python的课程");
    }
}
