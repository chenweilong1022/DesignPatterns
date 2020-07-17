package com.lingyi.memorandum.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-17 15:40
 */
public class Agent {

    private List<Memorandum> originators = new ArrayList<>();

    public void add(Memorandum memorandum) {
        originators.add(memorandum);
    }

    public Memorandum get(int index) {
        return this.originators.get(index);
    }

}
