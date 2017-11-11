package com.epam.javacore.homework.hw5.task2;

public class UsePropertyAnalyzer {
    public static void main(String[] args) {
        String path="C:\\!all\\!epam\\school_Autmn_Lapin\\project_homeworks\\homework5Exception\\src\\main\\java\\com\\epam\\javacore\\homework\\hw5\\task2\\questions_en_US.properties";
        System.out.println(PropertyAnalyzer.getValue(path, "question1"));
        System.out.println(PropertyAnalyzer.getValue(path, "question12"));
    }
}
