package com.lingyi.strategy.imporve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-08 22:05
 */
public class BadFlyBehavior implements FlyBehavior {


    @Override
    public void fly() {
        System.out.println("飞行技术差劲");
    }


}
