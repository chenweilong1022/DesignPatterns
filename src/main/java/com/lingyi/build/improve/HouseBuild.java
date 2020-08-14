package com.lingyi.build.improve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 10:38
 */
public abstract class HouseBuild {

    House house = new House();

    /**
     * 打地基
     */
    public abstract void foundation();

    /**
     * 砌墙
     */
    public abstract void buildWall();

    /**
     * 封顶
     */
    public abstract void capped();

    public House getHouse() {
        return house;
    }
}
