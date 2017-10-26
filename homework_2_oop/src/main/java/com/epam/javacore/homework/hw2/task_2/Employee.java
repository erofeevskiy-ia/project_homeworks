package com.epam.javacore.homework.hw2.task_2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private List<Stationery> list = new ArrayList<>();

    boolean addStationery(Stationery st) {
        if (st==null) return false;
        list.add(st);
        return true;
    }

    public int getCostStationary() {
        int sum=0;
        for(Stationery st: list)
            sum+=st.getCost();
        return sum;
    }
}
