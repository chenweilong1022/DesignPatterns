package com.lingyi.singleton.type3;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 14:36
 */
public class Singleton {


    private volatile static Singleton singleton;

    private Singleton() {

    }


    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
