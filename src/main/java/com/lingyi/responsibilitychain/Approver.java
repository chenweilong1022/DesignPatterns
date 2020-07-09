package com.lingyi.responsibilitychain;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-09 21:21
 */
public abstract class Approver {


    Approver approver;

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    protected String name;

    public Approver( String name) {
        this.name = name;
    }



    public abstract void process(ProcessRequest request);


}
