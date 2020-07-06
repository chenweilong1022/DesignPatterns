package com.lingyi.state.lottery.base.impl;

import com.lingyi.state.LotteryActivity;
import com.lingyi.state.lottery.base.AbstractState;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-06 21:59
 */
public class DeficiencyState extends AbstractState {


    LotteryActivity activity;


    public DeficiencyState(LotteryActivity activity) {
        this.activity = activity;
    }


    @Override
    public void deductMoney() {
        System.out.println("奖品已经发放完毕");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品已经发放完毕");
        return false;
    }

    @Override
    public void award() {
        System.out.println("奖品已经发放完毕");
    }
}
