package com.lingyi.singleton.type2;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 14:36
 */
public class Singleton {


    private static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    private Singleton() {

    }

    public static Singleton getInstance() {
        return singleton;
    }

}
