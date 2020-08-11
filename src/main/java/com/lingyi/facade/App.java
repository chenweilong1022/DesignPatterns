package com.lingyi.facade;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-11 22:40
 */
public class App {

    public static void main(String[] args) {



        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();


        homeTheaterFacade.read();
        homeTheaterFacade.play();
        homeTheaterFacade.end();
        homeTheaterFacade.pause();
    }
}
