package com.lingyi.strategy.imporve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-08 22:06
 */
public class PekingDuck extends Duck {


    @Override
    public void display() {
        System.out.println("这里是北京烤鸭");
    }


    public PekingDuck() {
        this.flyBehavior = new GoodFlyBehavior();
    }


}
