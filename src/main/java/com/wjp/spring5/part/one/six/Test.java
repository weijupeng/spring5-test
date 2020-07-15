package com.wjp.spring5.part.one.six;

/**
 * @author wjp
 * @date 2020/7/15 14:37
 */
public class Test {
    public static void resize(Quadrangle rectangle) {
        while (rectangle.getWidth() >= rectangle.getHeight()) {
//            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("width" + rectangle.getWidth() + ",height" + rectangle.getHeight());
        }
        System.out.println("resize方法结束" + "" +
                "\nwidth:" + rectangle.getWidth() + ",height:" + rectangle.getHeight());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20);
        rectangle.setHeight(10);
        resize(rectangle);
    }
}
