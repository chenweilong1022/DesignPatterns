package com.lingyi.memorandum.game;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-17 16:22
 */
public class App {


    public static void main(String[] args) {

        System.out.println("跟魔王大战前");


        Agent agent = new Agent();
        GameRole gameRole = new GameRole(100,100);
        agent.setMemOrandum(gameRole.save());
        gameRole.dispaly();


        System.out.println("跟魔王大战后");


        gameRole.setAtk(30);
        gameRole.setDef(30);
        gameRole.dispaly();

        gameRole.restore(agent.getMemOrandum());
        System.out.println("恢复到大战前");

        gameRole.dispaly();





    }
}
