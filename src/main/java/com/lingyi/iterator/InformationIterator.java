package com.lingyi.iterator;

import java.util.Iterator;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 18:14
 */
public class InformationIterator implements Iterator {

    private Department[] department;

    private int index;

    public InformationIterator(Department[] department) {
        this.department = department;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index >= department.length || department[index] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return department[index++];
    }

    @Override
    public void remove() {

    }
}
