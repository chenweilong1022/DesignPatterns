package com.lingyi.strategy.imporve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-08 22:00
 */
public abstract class Duck {


    protected FlyBehavior flyBehavior;


    public abstract void display();

    void cry() {
        System.out.println("鸭子会嘎嘎叫");
    }

    void fly(){
        if (flyBehavior != null) {
            this.display();
            flyBehavior.fly();
        }
    }

    void swim(){
        System.out.println("鸭子会游泳");
    }


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
