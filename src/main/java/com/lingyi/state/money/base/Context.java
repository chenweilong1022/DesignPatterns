package com.lingyi.state.money.base;

//����������
public class Context extends AbstractOrderStatus{
	//��ǰ��״̬ state, �������ǵ�ҵ�����̴�����ͣ�ı仯
	private OrderStatus orderStatus;


    @Override
    public void checkSuccessEvent(Context context) {
        orderStatus.checkSuccessEvent(this);
        getCurrentState();
    }

    @Override
    public void checkFailEvent(Context context) {
        orderStatus.checkFailEvent(this);
        getCurrentState();
    }

    @Override
    public void makePriceEvent(Context context) {
        orderStatus.makePriceEvent(this);
        getCurrentState();
    }

    @Override
    public void acceptOrderEvent(Context context) {
        orderStatus.acceptOrderEvent(this);
        getCurrentState();
    }

    @Override
    public void notPeopleAcceptOrderEvent(Context context) {
        orderStatus.notPeopleAcceptOrderEvent(this);
        getCurrentState();
    }

    @Override
    public void payOrderEvent(Context context) {
        orderStatus.payOrderEvent(this);
        getCurrentState();
    }

    @Override
    public void payFailOrderEvent(Context context) {
        orderStatus.payFailOrderEvent(this);
        getCurrentState();
    }

    @Override
    public void feedBackEvent(Context context) {
        orderStatus.feedBackEvent(this);
        getCurrentState();
    }

    @Override
    public String getCurrentState() {
        System.out.println("��ǰ״̬ : " + orderStatus.getCurrentState());
        return orderStatus.getCurrentState();
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }


}
