package com.epam.javacore.homework.hw2.task_3;

import com.epam.javacore.homework.hw2.task_4.Comparators.SortedByCost;
import com.epam.javacore.homework.hw2.task_4.Comparators.SortedByName;

import java.util.ArrayList;
import java.util.List;

public class SetOfNovice {

    static void sortingByName(List<Stationary> list) {
        for(int i=0;i<list.size();i++){
            list.sort(new SortedByName());
        }
    }
    static void sortingByCost(List<Stationary> list) {
        for(int i=0;i<list.size();i++){
            list.sort(new SortedByCost());
        }
    }

    static void sortingByCostThenName(List<Stationary> list) {
        for(int i=0;i<list.size();i++){
            list.sort(new SortedByCost().thenComparing(new SortedByName()));
        }
    }


    public static void main(String[] args) {
        List<Stationary> setOfNovice = new ArrayList<>();
        setOfNovice.add(new Notebook(650, "NoteBookForNovice"));
        setOfNovice.add(new Notebook(500, "NoteBookForEverything"));
        setOfNovice.add(new Pen(42, "Writer007", "Green"));
        setOfNovice.add(new Pen(22, "Writer999", "Black"));
        setOfNovice.add(new Pen(22, "!Writer999", "Black"));
        setOfNovice.add(new Pen(12, "Writer500", "Blue"));
        setOfNovice.add(new Pen(32, "Writer5", "Red"));
        //sortingByName(setOfNovice);
        //sortingByCost(setOfNovice);
        sortingByCostThenName(setOfNovice);
        for (Stationary st : setOfNovice) {
            System.out.println(st.getName() + " costs " + st.getCost());
        }
    }
}
