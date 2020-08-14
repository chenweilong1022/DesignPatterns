package com.lingyi.build.improve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 10:39
 */
public class OrdinaryHousesBuild extends HouseBuild {

    @Override
    public void foundation() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子打砌墙");
    }

    @Override
    public void capped() {
        System.out.println("普通房子打封顶");
    }
}
