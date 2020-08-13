package com.lingyi.visitor;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 22:25
 */
public class App {

    public static void main(String[] args) {

        Woman woman = new Woman();
        Man man = new Man();

        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(woman);
        objectStructure.add(man);


        Action action = new Success();
        objectStructure.display(action);


        Action action1 = new Fail();
        objectStructure.display(action1);

        Action action2 = new Abstain();
        objectStructure.display(action2);
    }
}
