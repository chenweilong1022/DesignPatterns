package com.lingyi.responsibilitychain;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-09 21:45
 */
public class App {


    public static void main(String[] args) {


        ProcessRequest request = new ProcessRequest(13001,"陈伟龙",1);


        DeanApprover approver1 = new DeanApprover();
        CollegeApprover approver2 = new CollegeApprover();
        ViceChancellorApprover approver3 = new ViceChancellorApprover();
        PrincipalApprover approver4 = new PrincipalApprover();



        approver1.setApprover(approver2);
        approver2.setApprover(approver3);
        approver3.setApprover(approver4);
        approver4.setApprover(approver1);

//        System.out.println("1");
        approver1.process(request);
//        System.out.println("2");
//        approver2.process(request);
//        approver3.process(request);
//        approver4.process(request);



    }
}
