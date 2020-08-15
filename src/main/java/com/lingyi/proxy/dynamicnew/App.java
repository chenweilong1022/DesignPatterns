package com.lingyi.proxy.dynamicnew;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 14:11
 */
public class App {


    public static void main(String[] args) {


        ITeachDao dao = new TeachDao();


        ProxyFactory factory = new ProxyFactory(dao);


        ITeachDao obj = (ITeachDao) factory.getObj();

//        obj.teach();

        obj.sysHello("龙龙");

    }
}
