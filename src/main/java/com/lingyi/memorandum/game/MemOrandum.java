package com.lingyi.memorandum.game;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-17 16:13
 */
public class MemOrandum {

    /**
     * 攻击力
     */
    private int atk;
    /**
     * 防御力
     */
    private int def;

    public MemOrandum(int atk, int def) {
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
