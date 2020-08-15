package com.lingyi.proxy.dynamicnew;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 14:08
 */
public class ProxyFactory {


    private Object target;


    public ProxyFactory() {
    }

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getObj() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK动态代理开始");
                Object invoke = method.invoke(target, args);
                System.out.println("JDK动态代理完成");
                return invoke;
            }
        });
    }


}
