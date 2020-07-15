package com.wjp.spring5.part.one.two.impl;

import com.wjp.spring5.part.one.two.ICourse;
import lombok.Data;

/**
 * @author wjp
 * @date 2020/7/15 11:06
 */
@Data
public class Tom {
    private ICourse course;

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void studyJavaCourse() {
        System.out.println("Tom在学习Java的课程");
    }

    public void studyPythonCourse() {
        System.out.println("Tom在学习Python的课程");
    }

    public void study() {
        course.study();
    }

    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.setCourse(new JavaCourse());
        tom.study();
        tom.setCourse(new PythonCourse());
        tom.study();
    }
}
