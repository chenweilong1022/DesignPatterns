package com.lingyi.strategy.imporve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-08 22:10
 */
public class NotFlyBehavior implements FlyBehavior {


    @Override
    public void fly() {
        System.out.println("不会飞翔");
    }
}
