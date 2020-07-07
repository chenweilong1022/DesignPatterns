package com.lingyi.state.money.base;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-07 21:17
 */
public abstract class AbstractOrderStatus implements OrderStatus {


    private final RuntimeException EXCEPTION = new RuntimeException("步骤错误");

    @Override
    public void checkSuccessEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void checkFailEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void makePriceEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void acceptOrderEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void notPeopleAcceptOrderEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void payOrderEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void payFailOrderEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void feedBackEvent(Context context) {
        throw EXCEPTION;
    }
}
