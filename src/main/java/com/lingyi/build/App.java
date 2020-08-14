package com.lingyi.build;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 10:29
 */
public class App {

    public static void main(String[] args) {

        System.out.println("~~~~~~普通房子开始盖~~~~~~");
         House h1 = new OrdinaryHouses();
         h1.build();
        System.out.println("~~~~~~高楼大厦开始盖~~~~~~");
         House h2 = new HighHouse();
         h2.build();


    }
}
