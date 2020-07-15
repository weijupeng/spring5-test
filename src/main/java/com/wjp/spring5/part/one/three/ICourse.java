package com.wjp.spring5.part.one.three;

/**
 * @author wjp
 * @date 2020/7/15 11:34
 */
public interface ICourse {
    String getCourseName();

    byte[] getCourseVideo();

    void studyCourse();

    void refundSourse();
}
