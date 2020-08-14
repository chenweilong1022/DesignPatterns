package com.lingyi.build.improve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 10:41
 */
public class HouseDirector {

    private HouseBuild houseBuildl;


    public HouseDirector(HouseBuild houseBuildl) {
        this.houseBuildl = houseBuildl;
    }

    public HouseDirector() {
    }


    public HouseBuild getHouseBuildl() {
        return houseBuildl;
    }

    public void setHouseBuildl(HouseBuild houseBuildl) {
        this.houseBuildl = houseBuildl;
    }


    public House build() {
        houseBuildl.foundation();
        houseBuildl.buildWall();
        houseBuildl.capped();
        return houseBuildl.getHouse();
    }
}
