package com.epam.javacore.homework.hw2.task_2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    List list = new ArrayList();

    boolean addStationery(Stationery st) {
        if (st==null) return false;
        list.add(st);
        return true;
    }

}
