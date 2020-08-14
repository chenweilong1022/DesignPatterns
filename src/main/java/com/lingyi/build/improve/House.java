package com.lingyi.build.improve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 10:37
 */
public class House {


    /**
     * 打地基
     */
    private String foundation;

    /**
     * 砌墙
     */
    private String buildWall;

    /**
     * 封顶
     */
    private String capped;


    public House() {
    }

    public House(String foundation, String buildWall, String capped) {
        this.foundation = foundation;
        this.buildWall = buildWall;
        this.capped = capped;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getBuildWall() {
        return buildWall;
    }

    public void setBuildWall(String buildWall) {
        this.buildWall = buildWall;
    }

    public String getCapped() {
        return capped;
    }

    public void setCapped(String capped) {
        this.capped = capped;
    }
}
