package com.lingyi.strategy.ordinary;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-08 21:39
 */
public abstract class Duck {

    public abstract void display();

    void cry() {
        System.out.println("鸭子会嘎嘎叫");
    }

    void fly(){
        System.out.println("鸭子会飞翔");
    }

    void swim(){
        System.out.println("鸭子会游泳");
    }

}
