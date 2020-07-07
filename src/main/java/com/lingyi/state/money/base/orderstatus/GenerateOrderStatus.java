package com.lingyi.state.money.base.orderstatus;

import com.lingyi.state.money.base.AbstractOrderStatus;
import com.lingyi.state.money.base.Context;
import com.lingyi.state.money.base.enums.OrderStatusEnum;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-07 21:35
 */
public class GenerateOrderStatus extends AbstractOrderStatus {

    @Override
    public void checkSuccessEvent(Context context) {
        context.setOrderStatus(new ReviewOrderStatus());
    }

    @Override
    public void checkFailEvent(Context context) {
        context.setOrderStatus(new FeedbackOrderStatus());
    }

    @Override
    public String getCurrentState() {
        return OrderStatusEnum.GENERATE.toString();
    }


}
