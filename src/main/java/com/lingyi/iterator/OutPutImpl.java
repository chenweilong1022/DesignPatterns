package com.lingyi.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 18:18
 */
public class OutPutImpl {


    private List<College> colleges;

    public OutPutImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    public List<College> getColleges() {
        return colleges;
    }

    public void setColleges(List<College> colleges) {
        this.colleges = colleges;
    }

    public void printColleges() {
        for (College college : colleges) {
            System.out.println("========="+college.getName()+"==========");
            printDepartment(college.createIterator());
        }
    }


    public void printDepartment(Iterator informationIterator) {
        while (informationIterator.hasNext()) {
            System.out.println(informationIterator.next());
        }
    }


}
