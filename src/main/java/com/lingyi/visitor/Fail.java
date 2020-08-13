package com.lingyi.visitor;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 22:21
 */
public class Fail implements Action {

    @Override
    public void getResultWoman(Woman woman) {
        System.out.println("女人给的结果是fail");
    }

    @Override
    public void getResultMan(Man man) {
        System.out.println("男人给的结果是fail");
    }
}
