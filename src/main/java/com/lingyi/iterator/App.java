package com.lingyi.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 18:17
 */
public class App {

    public static void main(String[] args) {


        List<College> colleges = new ArrayList<>();
        College college = new InformationCollege();

        colleges.add(college);

        college.addDepartment("网络专业","网络专业");
        college.addDepartment("信息专业","信息专业");
        college.addDepartment("默默专业","默默专业");




        OutPutImpl outPut = new OutPutImpl(colleges);

        outPut.printColleges();


    }
}
