package com.epam.javacore.homework.hw2.task_4.Comparators;

import com.epam.javacore.homework.hw2.task_3.Stationary;

import java.util.Comparator;

public class SortedByName implements Comparator<Stationary> {

    @Override
    public int compare(Stationary st1, Stationary st2) {
        return st1.getName().compareTo(st2.getName());
    }
}
