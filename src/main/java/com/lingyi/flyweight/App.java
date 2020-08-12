package com.lingyi.flyweight;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-12 22:43
 */
public class App {

    public static void main(String[] args) {

        WebSite webSite1 = WebSiteFactory.getWebSite("博客");
        webSite1.use(new User("小明1"));
        WebSite webSite2 = WebSiteFactory.getWebSite("网站");
        webSite2.use(new User("小明2"));
        WebSite webSite3 = WebSiteFactory.getWebSite("博客");
        webSite3.use(new User("小明3"));
        WebSite webSite4 = WebSiteFactory.getWebSite("博客");
        webSite4.use(new User("小明4"));
        WebSite webSite5 = WebSiteFactory.getWebSite("博客");
        webSite5.use(new User("小明5"));


        System.out.println(WebSiteFactory.count());

    }
}
