package com.epam.javacore.homework.hw4.task4;

import java.util.List;

public class Film {
    String topic;
    List<Actor> actorList;

    public Film(String topic, List<Actor> actorList) {
        this.topic = topic;
        this.actorList = actorList;
    }
}
