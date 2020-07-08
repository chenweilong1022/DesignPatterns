package com.lingyi.strategy.ordinary;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-08 21:44
 */
public class PekingDuck extends Duck {


    @Override
    public void display() {
        System.out.println("北京烤鸭");
    }


    @Override
    void fly() {
        System.out.println("北京烤鸭不能飞翔");
    }
}
