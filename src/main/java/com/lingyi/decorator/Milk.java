package com.lingyi.decorator;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 14:30
 */
public class Milk extends Decorator {


    public Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(2.00f);
    }
}
