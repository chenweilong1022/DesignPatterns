package com.lingyi.decorator;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 14:30
 */
public class SoyMilk extends Decorator {


    public SoyMilk(Drink drink) {
        super(drink);
        setDesc("豆浆");
        setPrice(9.00f);
    }
}
