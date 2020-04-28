package com.lingyi.proxy.statics.proxy;

import com.lingyi.proxy.statics.factory.WoManSuppliesFactory;
import com.lingyi.proxy.statics.interfaces.ManSupplies;
import com.lingyi.proxy.statics.interfaces.WoManSupplies;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-04-27 19:37
 */
public class WLStaticProxy implements ManSupplies, WoManSupplies {


    private ManSupplies manSupplies;
    private WoManSupplies woManSupplies;


    public WLStaticProxy(WoManSupplies woManSupplies) {
        this.woManSupplies = woManSupplies;
    }

    public WLStaticProxy(ManSupplies manSupplies) {
        this.manSupplies = manSupplies;
    }


    public void setWoManSupplies(WoManSupplies woManSupplies) {
        this.woManSupplies = woManSupplies;
    }

    @Override
    public void buyDoll(Integer size) {
        before();
        manSupplies.buyDoll(size);
        after();
    }


    private void before() {
        System.out.println("我提供了前置服务,可以为你选择最合适的尺寸");
    }


    private void after() {
        System.out.println("我提供了后置服务,可以为你提供全面打包,派送服务");
    }

    @Override
    public void buyBang(Integer length) {
        before();
        woManSupplies.buyBang(length);
        after();
    }
}
