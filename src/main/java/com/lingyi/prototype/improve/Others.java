package com.lingyi.prototype.improve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 16:13
 */
public class Others implements Cloneable{

    private String other;


    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    protected Others clone() throws CloneNotSupportedException {
        return (Others) super.clone();
    }
}
