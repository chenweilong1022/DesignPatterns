package com.lingyi.iterator;

import com.lingyi.decorator.Coffee;

import java.util.Iterator;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 18:11
 */
public class InformationCollege implements College {

    private Department[] department;
    private int index;

    public InformationCollege() {
        department = new Department[10];
        index = 0;
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        department[index] = new Department(name,desc);
        index++;
    }

    @Override
    public Iterator createIterator() {
        return new InformationIterator(department);
    }
}
