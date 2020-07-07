package com.lingyi.state.money.base.orderstatus;

import com.lingyi.state.money.base.AbstractOrderStatus;
import com.lingyi.state.money.base.Context;
import com.lingyi.state.money.base.enums.OrderStatusEnum;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-07 21:20
 */
public class ReviewOrderStatus extends AbstractOrderStatus {

    @Override
    public void makePriceEvent(Context context) {
        context.setOrderStatus(new PublishOrderStatus());
    }

    @Override
    public String getCurrentState() {
        return OrderStatusEnum.REVIEW.toString();
    }
}
