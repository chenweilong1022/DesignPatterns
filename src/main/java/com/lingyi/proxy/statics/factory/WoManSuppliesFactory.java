package com.lingyi.proxy.statics.factory;

import com.lingyi.proxy.statics.interfaces.WoManSupplies;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-04-27 19:35
 */
public class WoManSuppliesFactory implements WoManSupplies {


    @Override
    public void buyBang(Integer length) {
        System.out.println("恭喜你,你获得了一个长度为" + length + "的振动棒");
    }
}
