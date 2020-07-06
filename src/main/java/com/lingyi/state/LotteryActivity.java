package com.lingyi.state;

import com.lingyi.state.lottery.base.AbstractState;
import com.lingyi.state.lottery.base.State;
import com.lingyi.state.lottery.base.impl.AwardState;
import com.lingyi.state.lottery.base.impl.CanDrawState;
import com.lingyi.state.lottery.base.impl.DeficiencyState;
import com.lingyi.state.lottery.base.impl.NoDrawState;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-06 22:00
 */
public class LotteryActivity {


    /**
     * 抽奖数量
     */
    int count;
    /**
     * 状态
     */
    State state;

    public int getCount() {
        int currentCount = count;
        count--;
        return currentCount;
    }

    public void setState(State state) {
        this.state = state;
    }

    public AwardState getAwardState() {
        return awardState;
    }

    public CanDrawState getCanDrawState() {
        return canDrawState;
    }

    public DeficiencyState getDeficiencyState() {
        return deficiencyState;
    }

    public NoDrawState getNoDrawState() {
        return noDrawState;
    }

    AwardState awardState = new AwardState(this);
    CanDrawState canDrawState = new CanDrawState(this);
    DeficiencyState deficiencyState = new DeficiencyState(this);
    NoDrawState noDrawState = new NoDrawState(this);


    public LotteryActivity(int count) {
        this.count = count;
        state = noDrawState;
    }

    public void deductMoney() {
        state.deductMoney();
    }

    public void raffle() {

        if (state.raffle()) {
            state.award();
        }
    }

}
