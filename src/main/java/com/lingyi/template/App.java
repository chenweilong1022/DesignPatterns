package com.lingyi.template;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 16:24
 */
public class App {

    public static void main(String[] args) {

        System.out.println("开始芝麻豆浆");

        SoyMilk sesameSoyMilk = new SesameSoyMilk();
        sesameSoyMilk.make();


        System.out.println("开始红豆豆浆");
        SoyMilk redBeansSoyMilk = new RedBeansSoyMilk();
        redBeansSoyMilk.make();

        System.out.println("开始原味豆浆");
        SoyMilk originalSoyMilk = new OriginalSoyMilk();
        originalSoyMilk.make();


    }
}
