package com.lingyi.state.lottery.base;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-06 21:43
 */
public interface State {

    /**
     * 扣钱
     */
    void deductMoney();

    /**
     * 抽奖
     */
    boolean raffle();

    /**
     * 发放奖品
     */
    void award();

}
