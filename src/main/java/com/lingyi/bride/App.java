package com.lingyi.bride;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 11:40
 */
public class App {


    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~小米手机~~~~~~~~~`");
        Phone phone = new FoldPhone(new XiaoMi());

        phone.open();
        phone.close();
        phone.call();


        System.out.println("~~~~~~~~~~vivo手机~~~~~~~~~`");
        phone.setBrand(new Vivo());

        phone.open();
        phone.close();
        phone.call();
        System.out.println("~~~~~~~~~~小米手机~~~~~~~~~`");
        phone = new FullScreenPhone();
        phone.setBrand(new XiaoMi());
        phone.open();
        phone.close();
        phone.call();
    }
}
