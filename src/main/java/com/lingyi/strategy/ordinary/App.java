package com.lingyi.strategy.ordinary;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-08 21:50
 */
public class App {


    public static void main(String[] args) {


        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();


        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

    }
}
