package com.epam.javacore.homework.hw4.task4;

import java.io.Serializable;

public class Actor implements Serializable {

    @SuppressWarnings("FieldCanBeLocal")
    private String name;
    @SuppressWarnings("FieldCanBeLocal")
    private boolean gender;

    public Actor(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }
}
