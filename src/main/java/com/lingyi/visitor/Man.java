package com.lingyi.visitor;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 22:22
 */
public class Man implements Person {

    @Override
    public void accept(Action action) {
        action.getResultMan(this);
    }
}
