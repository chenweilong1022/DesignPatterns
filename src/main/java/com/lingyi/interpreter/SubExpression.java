package com.lingyi.interpreter;

import java.util.Map;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 10:18
 */
public class SubExpression extends SymbolExpression {


    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        return super.getLeft().interpreter(map) - super.getRight().interpreter(map);
    }
}
