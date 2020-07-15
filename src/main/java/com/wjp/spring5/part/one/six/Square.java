package com.wjp.spring5.part.one.six;

import lombok.Data;

/**
 * @author wjp
 * @date 2020/7/15 14:36
 */
@Data
public class Square implements Quadrangle {
    private long length;

    public long getWidth() {
        return length;
    }

    public long getHeight() {
        return length;
    }
}
