package com.lingyi.interpreter;

import java.util.Map;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 10:15
 */
public interface Expression {

    int interpreter(Map<String,Integer> map);

}
