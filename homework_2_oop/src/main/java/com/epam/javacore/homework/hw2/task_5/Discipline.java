package com.epam.javacore.homework.hw2.task_5;


import lombok.Getter;

public enum Discipline {
    MATH(true),
    PHYSICS(true),
    PHILOSOPHY(false),
    COMPUTER_SCIENCE(true);


    private final boolean marksIsDouble;

    Discipline(boolean marksIsDouble) {
        this.marksIsDouble = marksIsDouble;
    }

    public boolean isMarksIsDouble() {
        return marksIsDouble;
    }


}
