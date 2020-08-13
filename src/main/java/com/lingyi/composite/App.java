package com.lingyi.composite;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 22:00
 */
public class App {

    public static void main(String[] args) {

        OrganizationComponent organizationComponent = new School("清华大学","中国顶级大学");



        OrganizationComponent college1 = new College("计算机学院","计算机学院");
        OrganizationComponent college2 = new College("美术学语","美术学语");
        OrganizationComponent college3 = new College("数学学院","数学学院");



        OrganizationComponent department1 = new Department("网络工程","网络工程");
        OrganizationComponent department2 = new Department("计算机科学与技术","计算机科学与技术");
        OrganizationComponent department3 = new Department("软件工程","软件工程");


        OrganizationComponent department11 = new Department("临摹","临摹");
        OrganizationComponent department22 = new Department("素描","素描");
        OrganizationComponent department33 = new Department("快写","快写");



        college1.add(department1);
        college1.add(department2);
        college1.add(department3);


        college2.add(department11);
        college2.add(department22);
        college2.add(department33);


        organizationComponent.add(college1);
        organizationComponent.add(college2);
        organizationComponent.add(college3);



//        organizationComponent.print();

        college2.print();


    }
}
