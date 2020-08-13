package com.lingyi.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 21:55
 */
public class College extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public void print() {
        super.print();
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
