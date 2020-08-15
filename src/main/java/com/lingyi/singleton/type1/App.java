package com.lingyi.singleton.type1;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 14:37
 */
public class App {

    public static void main(String[] args) {


        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
