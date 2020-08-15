package com.lingyi.singleton.type5;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 14:56
 */
public class App {

    public static void main(String[] args) {

        Singleton singleton1 = Enums.getSingleton();
        Singleton singleton2 = Enums.getSingleton();

        System.out.println(singleton1 == singleton2);
    }
}
