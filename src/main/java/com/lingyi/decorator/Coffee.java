package com.lingyi.decorator;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 14:25
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
