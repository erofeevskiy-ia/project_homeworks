package com.epam.javacore.homework.hw2.task_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group {
    private String name;
    private Discipline discipline;
    private HashMap<Student, ArrayList<Number>> marksOfStudent;

    public Group(String name, Discipline discipline) {
        this.name = name;
        this.discipline = discipline;
        marksOfStudent = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void addStudent(Student student) {
        marksOfStudent.put(student, new ArrayList<>());
    }

    public List findMarks(Student student) {
        return marksOfStudent.get(student);
    }

    public void addMarks(Student student, Number mark) {

        ArrayList<Number> list = marksOfStudent.get(student);
        if (discipline.isMarksIsDouble() && !(mark instanceof Double))
            throw new RuntimeException("enter double mark");
        if (!discipline.isMarksIsDouble() && mark instanceof Double)
            throw new RuntimeException("enter integer mark");
            list.add(mark);
        marksOfStudent.put(student, list);

    }

}
