package com.epam.javacore.homework.hw2.task_4.Comparators;

import com.epam.javacore.homework.hw2.task_3.Stationary;
import java.util.Comparator;

public class SortedByCost implements Comparator<Stationary> {
    @Override
    public int compare(Stationary o1, Stationary o2) {
        int price1 = o1.getCost();
        int price2 = o2.getCost();

        return Integer.compare(price1, price2);
    }
}
