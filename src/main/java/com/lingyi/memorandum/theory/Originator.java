package com.lingyi.memorandum.theory;

/**
 * 创建人
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-17 15:36
 */
public class Originator {

    private String state;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memorandum saveMemorandum() {
        return new Memorandum(state);
    }

    /**
     * 获取状态根据保存人
     * @param memorandum
     * @return
     */
    public void getStateFromMemorandum(Memorandum memorandum) {
        this.state = memorandum.getState();
    }
}
