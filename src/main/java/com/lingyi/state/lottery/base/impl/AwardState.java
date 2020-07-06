package com.lingyi.state.lottery.base.impl;

import com.lingyi.state.LotteryActivity;
import com.lingyi.state.lottery.base.AbstractState;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-06 21:58
 */
public class AwardState extends AbstractState {

    LotteryActivity activity;


    public AwardState(LotteryActivity activity) {
        this.activity = activity;
    }

    @Override
    public void award() {
        if (activity.getCount() > 0) {
            System.out.println("发放奖品");
            activity.setState(activity.getNoDrawState());
        }else {
            System.out.println("奖品已经发放完毕了");
            activity.setState(activity.getDeficiencyState());
        }
    }
}
