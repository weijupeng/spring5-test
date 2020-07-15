package com.wjp.spring5.part.one.five;

import java.util.ArrayList;

/**
 * @author wjp
 * @date 2020/7/15 13:47
 */
public class TeamLeader {
    public void checkNumberOfCourses() {
        ArrayList<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("目前以发布的课程数量是：" + courseList.size());
    }
}
