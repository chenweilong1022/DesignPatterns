package com.lingyi.interpreter;

import java.util.Map;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 10:16
 */
public class VarExpression implements Expression {


    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    public VarExpression() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        return map.get(this.getKey());
    }
}
