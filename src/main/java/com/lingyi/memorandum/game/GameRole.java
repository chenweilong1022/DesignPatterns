package com.lingyi.memorandum.game;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-17 16:18
 */
public class GameRole {

    /**
     * 攻击力
     */
    private int atk;
    /**
     * 防御力
     */
    private int def;

    public MemOrandum save() {
        return new MemOrandum(atk,def);
    }

    public void restore(MemOrandum memOrandum) {
        this.atk = memOrandum.getAtk();
        this.def = memOrandum.getDef();
    }

    public void dispaly() {
        System.out.printf("当前的攻击力 = %s,当前的防御力 = %s\n",this.atk,this.def);
    }

    public GameRole(int atk, int def) {
        this.atk = atk;
        this.def = def;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
