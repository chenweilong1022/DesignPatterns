package com.lingyi.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 22:27
 */
public class ObjectStructure {


    List<Person> people = new ArrayList<>();


    public void add(Person person) {
        people.add(person);
    }


    public void remove(Person person) {
        people.remove(person);
    }

    public void display(Action action) {
        for (Person person : people) {
            person.accept(action);
        }
    }


}
