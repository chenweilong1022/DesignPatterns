package com.lingyi.observer.improve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 15:34
 */
public interface Observable {

    void register(Observer observer);

    void remove(Observer observer);

    void notifyObs();
}
