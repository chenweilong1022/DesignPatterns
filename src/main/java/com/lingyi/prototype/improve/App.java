package com.lingyi.prototype.improve;



/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 16:10
 */
public class App {


    public static void main(String[] args) throws CloneNotSupportedException {


        Others others = new Others();
        others.setOther("111222333");
        Sheep sheep = new Sheep("小样",10,"绿色");

        sheep.setOthers(others);

        Sheep clone1 = sheep.clone();
        Sheep clone2 = sheep.clone();
        Sheep clone3 = sheep.clone();
        Sheep clone4 = sheep.clone();

        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(clone3);
        System.out.println(clone4);
        System.out.println(sheep);

    }
}
