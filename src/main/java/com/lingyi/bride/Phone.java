package com.lingyi.bride;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 11:36
 */
public abstract class Phone {

    private Brand brand;


    public Phone() {
    }

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }



    protected void open() {
        brand.open();
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.call();
    }



}
