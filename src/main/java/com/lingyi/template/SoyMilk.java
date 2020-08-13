package com.lingyi.template;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 16:17
 */
public abstract class SoyMilk {

    void make() {
        choose();
        if (others()){
            addOthers();
        }
        soak();
        soyMilk();
    }

    public abstract void addOthers();

    public boolean others(){
        return true;
    }

    public void choose() {
        System.out.println("第一步选材料");
    }

    public void soak() {
        System.out.println("第二步浸泡");
    }

    public void  soyMilk() {
        System.out.println("第三部打豆浆");
    }
}
