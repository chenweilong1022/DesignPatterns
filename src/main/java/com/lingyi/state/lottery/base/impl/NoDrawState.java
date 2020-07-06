package com.lingyi.state.lottery.base.impl;

import com.lingyi.state.LotteryActivity;
import com.lingyi.state.lottery.base.AbstractState;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-06 21:47
 */
public class NoDrawState extends AbstractState {

    LotteryActivity activity;


    public NoDrawState(LotteryActivity activity) {
        this.activity = activity;
    }


    @Override
    public void deductMoney() {
        System.out.println("您扣除50积分成功");
        activity.setState(activity.getCanDrawState());
    }
}
