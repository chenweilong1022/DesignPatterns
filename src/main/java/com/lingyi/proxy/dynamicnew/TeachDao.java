package com.lingyi.proxy.dynamicnew;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 14:08
 */
public class TeachDao implements ITeachDao {


    @Override
    public void teach() {
        System.out.println("我是老师....我在授课中");
    }

    @Override
    public void sysHello(String name) {
        System.out.printf("你好%s\n",name);
    }
}
