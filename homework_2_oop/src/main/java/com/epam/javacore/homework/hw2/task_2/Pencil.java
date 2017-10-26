package com.epam.javacore.homework.hw2.task_2;

public class Pencil implements Stationery {
    private int cost;

    public Pencil(int cost){
        this.cost=cost;
    }

    @Override
    public int getCost(int cost) {
        return this.cost;
    }
}
