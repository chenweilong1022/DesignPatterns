package com.lingyi.proxy.dynamic;

import com.lingyi.proxy.dynamic.proxy.DynamicProxy;
import com.lingyi.proxy.statics.factory.ChildSuppliesFactory;
import com.lingyi.proxy.statics.factory.ManSuppliesFactory;
import com.lingyi.proxy.statics.factory.WoManSuppliesFactory;
import com.lingyi.proxy.statics.interfaces.ChildSupplies;
import com.lingyi.proxy.statics.interfaces.ManSupplies;
import com.lingyi.proxy.statics.interfaces.WoManSupplies;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-04-27 20:08
 */
public class App {

    public static void main(String[] args) {
        manSupplies();

        womanSupplies();

        childSupplies();

    }


    public static void manSupplies() {

        ManSuppliesFactory manSuppliesFactory = new ManSuppliesFactory();


        DynamicProxy dynamicProxy = new DynamicProxy(manSuppliesFactory);

        ManSupplies manSupplies = (ManSupplies) dynamicProxy.newProxyInstance();


        manSupplies.buyDoll(4);



    }


    public static void womanSupplies() {

        WoManSuppliesFactory woManSuppliesFactory = new WoManSuppliesFactory();

        DynamicProxy dynamicProxy = new DynamicProxy(woManSuppliesFactory);


        WoManSupplies woManSupplies = (WoManSupplies) dynamicProxy.newProxyInstance();


        woManSupplies.buyBang(18);


    }


    public static void childSupplies() {

        ChildSuppliesFactory childSuppliesFactory = new ChildSuppliesFactory();


        DynamicProxy dynamicProxy = new DynamicProxy(childSuppliesFactory);

        ChildSupplies childSupplies = (ChildSupplies) dynamicProxy.newProxyInstance();


        childSupplies.buyMilk("AD钙奶");



    }




}
