package com.lingyi.responsibilitychain;

import cn.hutool.json.JSONUtil;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-09 21:24
 */
public class PrincipalApprover extends Approver {


    public PrincipalApprover() {
        super("校长");
    }

    @Override
    public void process(ProcessRequest request) {
        if (request.getPrice() > 10000 && request.getPrice() <= 30000) {
            System.out.printf("我是%s,我审批了%s\r",this.name, JSONUtil.toJsonStr(request));
        }else {
            approver.process(request);
        }

    }
}
