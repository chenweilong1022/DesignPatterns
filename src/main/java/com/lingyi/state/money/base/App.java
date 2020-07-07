package com.lingyi.state.money.base;

import com.lingyi.state.money.base.orderstatus.GenerateOrderStatus;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-07 22:05
 */
public class App {

    public static void main(String[] args) {

        Context context = new Context();
        context.setOrderStatus(new GenerateOrderStatus());
        System.out.println(context.getCurrentState());

        context.checkSuccessEvent(context);
        context.makePriceEvent(context);

//        context.acceptOrderEvent(context);
        context.notPeopleAcceptOrderEvent(context);
    }
}
