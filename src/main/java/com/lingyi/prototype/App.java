package com.lingyi.prototype;

/**
 * 传统的克隆对象太繁琐
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 16:04
 */
public class App {


    public static void main(String[] args) {


        Sheep sheep = new Sheep("小样",10,"绿色");



        Sheep sheep1 = new Sheep();
        sheep1.setName(sheep.getName());
        sheep1.setAge(sheep.getAge());
        sheep1.setColor(sheep.getColor());

        System.out.println(sheep);
        System.out.println(sheep1);


    }
}
