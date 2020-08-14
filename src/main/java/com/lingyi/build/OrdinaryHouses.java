package com.lingyi.build;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 10:28
 */
public class OrdinaryHouses extends House {

    @Override
    public void foundation() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void capped() {
        System.out.println("普通房子封顶");
    }
}
