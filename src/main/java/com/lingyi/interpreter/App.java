package com.lingyi.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 10:26
 */
public class App {


    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        calculator.regex("A+B+C+D-E+F");

        Map<String,Integer> map = new HashMap<>();

        map.put("A",10);
        map.put("B",20);
        map.put("C",30);
        map.put("D",40);
        map.put("E",20);
        map.put("F",10);
        int run = calculator.run(map);

        System.out.println("结果是" + run);
    }
}
