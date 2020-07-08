package com.lingyi.strategy.imporve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-08 22:11
 */
public class ToyDuck extends Duck{


    @Override
    public void display() {
        System.out.println("这里是玩具鸭");
    }


    public ToyDuck() {
        this.flyBehavior = new NotFlyBehavior();
    }
}
