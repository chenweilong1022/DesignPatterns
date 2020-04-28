package com.lingyi.proxy.statics.factory;

import com.lingyi.proxy.statics.interfaces.ManSupplies;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-04-27 19:35
 */
public class ManSuppliesFactory implements ManSupplies {

    @Override
    public void buyDoll(Integer size) {
        System.out.println("恭喜,您获得了一个罩杯为" + size + "的重启娃娃");
    }
}
