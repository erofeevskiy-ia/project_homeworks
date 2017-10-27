package com.epam.javacore.homework.hw2.task_3;

import java.util.ArrayList;
import java.util.List;

public class SetOfNovice {


    public static void main(String[] args) {
     List<Stationary> setOfNovice = new ArrayList<>();
     setOfNovice.add(new Pen(12,"Writer500","Blue"));
     setOfNovice.add(new Pen(22,"Writer999","Black"));
     setOfNovice.add(new Pen(32,"Writer5","Red"));
     setOfNovice.add(new Pen(42,"Writer007","Green"));
     setOfNovice.add(new Notebook(500,"NoteBookForEverything"));
     setOfNovice.add(new Notebook(650,"NoteBookForNovice"));

     for(Stationary st:setOfNovice){
         System.out.println(st.getName() + " costs "+st.getCost());
     }
    }
}
