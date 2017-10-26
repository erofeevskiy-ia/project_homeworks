package com.epam.javacore.homework.hw2.task_3;

public class Pen extends Stationary implements Writing {
    private int cost;
    private String name;
    private String color;

    public Pen(int cost, String name, String color) {
        this.cost = cost;
        this.name = name;
        this.color = color;
    }


    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String writeSomewhere(String st) {
        return st;
    }
}
