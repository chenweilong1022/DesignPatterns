package com.lingyi.strategy.ordinary;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-08 21:55
 */
public class ToyDuck extends Duck {


    @Override
    public void display() {
        System.out.println("玩具鸭");
    }


    @Override
    void cry() {
        System.out.println("玩具鸭不会嘎嘎叫");
    }

    @Override
    void fly() {
        System.out.println("玩具鸭不会飞翔");
    }

    @Override
    void swim() {
        System.out.println("玩具鸭不会游泳");
    }
}
