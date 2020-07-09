package com.lingyi.responsibilitychain;

import cn.hutool.json.JSONUtil;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-09 21:24
 */
public class DeanApprover extends Approver {


    public DeanApprover() {
        super("教导主任");
    }

    @Override
    public void process(ProcessRequest request) {
        if (request.getPrice() <= 1000) {
            System.out.printf("我是%s,我审批了%s,%s\r",this.name, JSONUtil.toJsonStr(request),System.currentTimeMillis());
        }else {
            approver.process(request);
        }

    }
}
