package com.lingyi.composite;

/**
 * 组合模式接口
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 21:51
 */
public abstract class OrganizationComponent {

    private String name;
    private String desc;


    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public void add(OrganizationComponent organizationComponent) {

    }

    public void remove(OrganizationComponent organizationComponen) {

    }

    public void print(){
        System.out.println("~~~~~~~~~~"+getName()+"~~~~~~~~~");
    }

}
