package com.lingyi.interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 10:19
 */
public class Calculator {


    private Expression expression;

    public void regex(String regex) {
        Stack<Expression> stack = new Stack<>();
        char[] chars = regex.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            char aChar = chars[i];

            switch (aChar) {
                case '+': {
                    Expression left = stack.pop();
                    VarExpression right = new VarExpression(String.valueOf(chars[++i]));
                    AddExpression addExpression = new AddExpression(left, right);
                    stack.push(addExpression);
                    break;
                }
                case '-': {
                    Expression left = stack.pop();
                    VarExpression right = new VarExpression(String.valueOf(chars[++i]));
                    SubExpression subExpression = new SubExpression(left, right);
                    stack.push(subExpression);
                    break;
                }
                default: {
                    stack.push(new VarExpression(String.valueOf(aChar)));
                    break;
                }

            }
        }

        this.expression = stack.pop();
    }


    public int run(Map<String,Integer> map) {
        return this.expression.interpreter(map);
    }


}
