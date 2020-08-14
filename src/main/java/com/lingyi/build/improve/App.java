package com.lingyi.build.improve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 10:43
 */
public class App {

    public static void main(String[] args) {

        HouseBuild ordinaryHousesBuild = new OrdinaryHousesBuild();
        HouseBuild highHousesBuild = new HighHousesBuild();

        System.out.println("~~~~~~~~~开始构建普通房子~~~~~~~~~~");
        HouseDirector houseDirector = new HouseDirector();
        houseDirector.setHouseBuildl(ordinaryHousesBuild);
        houseDirector.build();


        System.out.println("~~~~~~~~~开始构建高楼大厦~~~~~~~~~~");
        houseDirector.setHouseBuildl(highHousesBuild);
        houseDirector.build();

    }
}
