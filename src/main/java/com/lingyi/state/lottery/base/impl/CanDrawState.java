package com.lingyi.state.lottery.base.impl;

import cn.hutool.core.util.RandomUtil;
import com.lingyi.state.LotteryActivity;
import com.lingyi.state.lottery.base.AbstractState;

import java.util.Random;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-06 21:52
 */
public class CanDrawState extends AbstractState {

    LotteryActivity activity;


    public CanDrawState(LotteryActivity activity) {
        this.activity = activity;
    }

    @Override
    public boolean raffle() {
        System.out.println("开始抽奖");
        int i = RandomUtil.randomInt(0, 10);

        if (i == 0) {
            System.out.println("抽中奖品");
            activity.setState(activity.getAwardState());
            return true;
        }else {
            System.out.println("很遗憾您没有中奖");
        }
        activity.setState(activity.getNoDrawState());
        return false;
    }
}
