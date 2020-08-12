package com.lingyi.flyweight;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-12 22:37
 */
public class ConcreteWebSite implements WebSite {

    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.printf("网站的发布形似为%s,访问的人是%s\n",type,user.getName());
    }
}
