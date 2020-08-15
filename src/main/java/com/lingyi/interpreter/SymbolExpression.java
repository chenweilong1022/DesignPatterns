package com.lingyi.interpreter;

import java.util.Map;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 10:17
 */
public class SymbolExpression implements Expression {


    private Expression left;

    private Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        return 0;
    }
}
