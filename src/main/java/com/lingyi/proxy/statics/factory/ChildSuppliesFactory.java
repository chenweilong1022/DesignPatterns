package com.lingyi.proxy.statics.factory;

import com.lingyi.proxy.statics.interfaces.ChildSupplies;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-04-27 19:35
 */
public class ChildSuppliesFactory implements ChildSupplies {

    @Override
    public void buyMilk(String nutrition) {
        System.out.println("获得了一个奶粉,富含营养" + nutrition + "的奶粉");
    }
}
