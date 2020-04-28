package com.lingyi.proxy.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-04-27 19:59
 */
public class DynamicProxy implements InvocationHandler {


    private Object factory;


    public DynamicProxy(Object factory) {
        this.factory = factory;
    }


    public Object newProxyInstance() {
        return Proxy.newProxyInstance(factory.getClass().getClassLoader(),factory.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(factory, args);
        after();
        return invoke;
    }


    private void before() {
        System.out.println("我提供了前置服务,可以为你选择最合适的尺寸");
    }


    private void after() {
        System.out.println("我提供了后置服务,可以为你提供全面打包,派送服务");
    }

}
