package com.lingyi.strategy.imporve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-08 22:07
 */
public class App {


    public static void main(String[] args) {



        Duck duck = new PekingDuck();

        duck.fly();

        duck.setFlyBehavior(new BadFlyBehavior());

        duck.fly();


        Duck d = new ToyDuck();

        d.fly();


        d.setFlyBehavior(new BadFlyBehavior());

        d.fly();

    }
}
