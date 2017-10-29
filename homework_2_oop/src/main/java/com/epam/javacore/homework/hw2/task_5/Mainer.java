package com.epam.javacore.homework.hw2.task_5;

import java.util.List;

public class Mainer {
    public static void main(String[] args) {
       Group gr1 = new Group("23541_PH",Discipline.PHILOSOPHY);
       Student vasyaPetrov = new Student("Vasily Petrov");
       gr1.addStudent(vasyaPetrov);
       gr1.addMarks(vasyaPetrov,4);
       gr1.addMarks(vasyaPetrov,4);
       gr1.addMarks(vasyaPetrov,5);
        List<Number> list = gr1.findMarks(vasyaPetrov);//fixme
        System.out.printf("%s %s%n",vasyaPetrov.getName(),gr1.getName());
        for (Number n: list) {
           if(gr1.getDiscipline().isMarksIsDouble())
               //noinspection ControlFlowStatementWithoutBraces
               System.out.printf("%.3f%n",n);
            else
               //noinspection ControlFlowStatementWithoutBraces
               System.out.printf("%d%n",n);
        }

    }
}
