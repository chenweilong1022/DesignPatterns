package com.lingyi.visitor;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 22:30
 */
public class Abstain implements Action {


    @Override
    public void getResultWoman(Woman woman) {
        System.out.println("女人的结果是弃权");
    }

    @Override
    public void getResultMan(Man man) {
        System.out.println("男人的结果是弃权");
    }
}
