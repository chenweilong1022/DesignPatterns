package com.lingyi.memorandum.theory;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-17 16:04
 */
public class App {


    public static void main(String[] args) {


        Agent agent = new Agent();

        Originator originator = new Originator();
        originator.setState("#1 当前攻击力100");
        agent.add(originator.saveMemorandum());
        System.out.println("当前攻击力 : " + originator.getState());

        originator.setState("#2 当前攻击力80");
        agent.add(originator.saveMemorandum());
        System.out.println("当前攻击力 : " + originator.getState());

        originator.setState("#3 当前攻击力60");
        agent.add(originator.saveMemorandum());
        System.out.println("当前攻击力 : " + originator.getState());


        originator.getStateFromMemorandum(agent.get(1));

        System.out.println("当前攻击力 : " + originator.getState());

    }
}
