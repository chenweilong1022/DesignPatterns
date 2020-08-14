package com.lingyi.build;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 10:29
 */
public class HighHouse extends House {

    @Override
    public void foundation() {
        System.out.println("高楼大厦打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼大厦砌墙");
    }

    @Override
    public void capped() {
        System.out.println("高楼大厦封顶");
    }
}
