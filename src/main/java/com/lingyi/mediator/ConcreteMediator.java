package com.lingyi.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 11:11
 */
public class ConcreteMediator implements Mediator {



    private Map<String,Colleague> colleagueMap = new HashMap<>();

    private Map<String,String> interMap = new HashMap<>();




    @Override
    public void register(Colleague colleague, String name) {
        colleagueMap.put(name,colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm",name);
        }

    }

    @Override
    public void getMsg(int stateChange, String colleagueName) {

        Colleague colleague = colleagueMap.get(colleagueName);

        if (colleague instanceof Alarm) {

            Alarm alarm = (Alarm) colleague;

            if (stateChange == 0) {
                alarm.noise();
            }else if (stateChange == 1) {
                alarm.close();
            }
        }




    }

    @Override
    public void sendMsg() {

    }
}
