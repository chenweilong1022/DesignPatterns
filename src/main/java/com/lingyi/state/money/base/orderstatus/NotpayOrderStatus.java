package com.lingyi.state.money.base.orderstatus;

import com.lingyi.state.money.base.AbstractOrderStatus;
import com.lingyi.state.money.base.Context;
import com.lingyi.state.money.base.enums.OrderStatusEnum;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-07 21:52
 */
public class NotpayOrderStatus extends AbstractOrderStatus {

    @Override
    public void payOrderEvent(Context context) {
        context.setOrderStatus(new PayOrderStatus());
    }

    @Override
    public void payFailOrderEvent(Context context) {
        context.setOrderStatus(new FeedbackOrderStatus());
    }

    @Override
    public String getCurrentState() {
        return OrderStatusEnum.NOT_PAY.toString();
    }
}
