package com.lingyi.state.money.base.enums;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-07 21:21
 */
public enum OrderStatusEnum {


    GENERATE(1,"订单生成"),
    REVIEW(2,"已审核"),
    PUBLISH(3,"已经发布"),
    NOT_PAY(4,"待支付"),
    PAY(5,"已支付"),
    FEEDBACK(6,"已经反馈");



    private Integer key;
    private String value;


    OrderStatusEnum(Integer key, String value) {

        this.key = key;
        this.value = value;
    }


    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "OrderStatusEnum{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }}
