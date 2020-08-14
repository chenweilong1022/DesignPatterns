package com.lingyi.decorator;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 14:23
 */
public abstract class Drink {


    private String desc;

    private float price = 0.00f;

    public Drink(String desc, float price) {
        this.desc = desc;
        this.price = price;
    }

    public Drink() {
    }

    public Drink(String desc) {
        this.desc = desc;
    }

    public Drink(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
