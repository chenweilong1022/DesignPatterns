package com.lingyi.build;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 10:25
 */
public abstract class House {

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



    public void build() {
        foundation();
        buildWall();
        capped();
    }


}
