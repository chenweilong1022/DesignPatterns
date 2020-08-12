package com.lingyi.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-12 22:39
 */
public class WebSiteFactory {

    private static Map<String,WebSite> pool = new HashMap<>();


    public static WebSite getWebSite(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }


    public static Integer count() {
        return pool.size();
    }

}
