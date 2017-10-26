package com.epam.javacore.homework.hw2.task_3;

import java.util.ArrayList;
import java.util.List;

public class Notebook extends Stationary implements Recording {

    private int cost;
    private String name;
    private List<String> listOfInfo = new ArrayList<>();

    public Notebook(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    @Override
    public boolean recordInYourself(String info) {
        if (info==null) return false;
        return listOfInfo.add(info);

    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }
}
