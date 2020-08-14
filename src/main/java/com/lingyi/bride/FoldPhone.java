package com.lingyi.bride;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 11:38
 */
public class FoldPhone extends Phone {


    public FoldPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("直立手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直立手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直立手机");
    }
}
