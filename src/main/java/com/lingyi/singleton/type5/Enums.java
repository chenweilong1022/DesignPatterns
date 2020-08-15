package com.lingyi.singleton.type5;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 14:53
 */
public enum  Enums {

    Singleton,
    ;

    private Singleton singleton;

    Enums() {
        singleton = new Singleton();
    }

    public Singleton getIns() {
        return singleton;
    }

    public static Singleton getSingleton() {
        return Enums.Singleton.getIns();
    }
}
