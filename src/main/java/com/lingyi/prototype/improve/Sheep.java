package com.lingyi.prototype.improve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 16:02
 */
public class Sheep implements Cloneable{

    private String name;

    private int age;

    private String color;

    private Others others;

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();
        Others clone = others.clone();
        sheep.setOthers(clone);
        return sheep;
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Sheep() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Others getOthers() {
        return others;
    }

    public void setOthers(Others others) {
        this.others = others;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", others=" + others +
                '}';
    }
}
