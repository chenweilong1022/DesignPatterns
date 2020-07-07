package com.lingyi.state.money.base;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-07 21:10
 */
public interface OrderStatus {


    /**
     * 电审成功
     */
    void checkSuccessEvent(Context context);

    /**
     * 电审失败
     */
    void checkFailEvent(Context context);

    /**
     * 定价发布
     */
    void makePriceEvent(Context context);

    /**
     * 接单
     */
    void acceptOrderEvent(Context context);

    /**
     * 无人接单失效
     */
    void notPeopleAcceptOrderEvent(Context context);

    /**
     * 付款成功
     */
    void payOrderEvent(Context context);

    /**
     * 支付失败
     */
    void payFailOrderEvent(Context context);

    /**
     * 反馈
     */
    void feedBackEvent(Context context);

    /**
     * 当前状态
     * @return
     */
    String getCurrentState();
}
