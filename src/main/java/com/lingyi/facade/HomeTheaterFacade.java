package com.lingyi.facade;

import com.sun.org.apache.bcel.internal.generic.POP;

/**
 * 外观模式
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-11 22:36
 */
public class HomeTheaterFacade {


    DVDPlayer dvdPlayer;
    Popcorn popcorn;
    Projector projector;
    Screen screen;
    Stereo stereo;
    TheaterLight theaterLight;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstanc();
        this.popcorn = Popcorn.getInstanc();
        this.projector = Projector.getInstanc();
        this.screen = Screen.getInstanc();
        this.stereo = Stereo.getInstanc();
        this.theaterLight = TheaterLight.getInstanc();
    }



    public void read() {
        popcorn.on();
        popcorn.pop();;
        screen.down();;
        projector.on();;
        stereo.on();;
        theaterLight.dim();;
    }

    public void play() {
        dvdPlayer.play();;
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
