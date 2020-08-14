package com.lingyi.iterator;

import java.util.Iterator;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 18:08
 */
public interface College {

    String getName();

    void addDepartment(String name,String desc);

    Iterator createIterator();
}
