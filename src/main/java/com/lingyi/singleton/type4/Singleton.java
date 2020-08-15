package com.lingyi.singleton.type4;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 14:49
 */
public class Singleton {


    public static Singleton getInstance() {
        return SingletonStatic.singleton;
    }


    private static class SingletonStatic {
        private static Singleton singleton = new Singleton();
    }



}
