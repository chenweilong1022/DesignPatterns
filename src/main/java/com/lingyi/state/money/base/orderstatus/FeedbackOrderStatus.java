package com.lingyi.state.money.base.orderstatus;

import com.lingyi.state.money.base.AbstractOrderStatus;
import com.lingyi.state.money.base.enums.OrderStatusEnum;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-07 21:36
 */
public class FeedbackOrderStatus extends AbstractOrderStatus {


    @Override
    public String getCurrentState() {
        return OrderStatusEnum.FEEDBACK.toString();
    }
}
