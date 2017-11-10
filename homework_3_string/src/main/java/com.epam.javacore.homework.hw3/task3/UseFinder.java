package com.epam.javacore.homework.hw3.task3;

import java.util.regex.Pattern;

public class UseFinder {
    public static void main(String[] args) {
        FinderRegExp f = new FinderRegExp("C:\\!all\\!epam\\school_Autmn_Lapin\\project_homeworks\\homework_3_string\\src\\main\\java\\com.epam.javacore.homework.hw3\\task3\\newfundamentalphysics.html");
        f.findSentence(f.findRef());
    }
}
