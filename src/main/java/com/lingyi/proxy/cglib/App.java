package com.lingyi.proxy.cglib;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 14:32
 */
public class App {


    public static void main(String[] args) {

        TeachDao teachDao = new TeachDao();

        ProxyFactory proxyFactory = new ProxyFactory(teachDao);

        TeachDao o = (TeachDao) proxyFactory.get();

        o.teach();

    }
}
