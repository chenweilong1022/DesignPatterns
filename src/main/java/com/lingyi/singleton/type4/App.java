package com.lingyi.singleton.type4;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 14:52
 */
public class App {

    public static void main(String[] args) {


        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);


    }

}
