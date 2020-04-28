package com.lingyi.proxy.statics;

import com.lingyi.proxy.statics.factory.ManSuppliesFactory;
import com.lingyi.proxy.statics.factory.WoManSuppliesFactory;
import com.lingyi.proxy.statics.proxy.WLStaticProxy;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-04-27 19:42
 */
public class App {


    public static void main(String[] args) {
//        manSupplies();

        womanSupplies();

    }


    public static void manSupplies() {

        ManSuppliesFactory manSuppliesFactory = new ManSuppliesFactory();


        WLStaticProxy wlStaticProxy = new WLStaticProxy(manSuppliesFactory);


        wlStaticProxy.buyDoll(4);



    }


    public static void womanSupplies() {

        WoManSuppliesFactory woManSuppliesFactory = new WoManSuppliesFactory();

        WLStaticProxy wlStaticProxy = new WLStaticProxy(woManSuppliesFactory);


        wlStaticProxy.buyBang(18);


    }


}
