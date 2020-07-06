package com.lingyi.state.lottery.base;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-06 21:45
 */
public class AbstractState implements State {


    @Override
    public void deductMoney() {
        System.out.println("您不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("你不能抽奖");
        return false;
    }

    @Override
    public void award() {
        System.out.println("您不能发放奖品");
    }
}
