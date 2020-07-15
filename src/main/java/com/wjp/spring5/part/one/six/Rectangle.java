package com.wjp.spring5.part.one.six;

import lombok.Data;

/**
 * @author wjp
 * @date 2020/7/15 14:35
 */
@Data
public class Rectangle implements Quadrangle{
    private long height;
    private long width;

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
