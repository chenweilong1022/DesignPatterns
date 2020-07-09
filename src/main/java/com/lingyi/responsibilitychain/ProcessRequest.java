package com.lingyi.responsibilitychain;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-07-09 21:23
 */
public class ProcessRequest {

    private int price;

    private String name;

    private Integer id;


    public ProcessRequest(int price, String name, Integer id) {
        this.price = price;
        this.name = name;
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
