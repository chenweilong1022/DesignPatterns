package com.lingyi.bride;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 13:57
 */
public class FullScreenPhone extends Phone {


    public FullScreenPhone() {
    }

    public FullScreenPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("全面屏手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("全面屏手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("全面屏手机");
    }
}
