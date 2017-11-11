package com.epam.javacore.homework.hw4.task1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ByteStreamCase {
    private static final List<String> KEY_WORDS_JAVA;
    static {
        KEY_WORDS_JAVA= Arrays.asList(
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "double", "do", "else", "enum", "extends", "final", "finally",
                "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface",
                "long", "native", "new", "package", "private", "protected", "public", "return", "short",
                "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient",
                "try", "void", "volatile", "while");
    }


    //    private FileInputStream fileInputStream;
//    private FileOutputStream fileOutputStream;
    private String stringInFile;
    private String stringOutFile;


    public ByteStreamCase(String si, String so) {
        stringInFile = si;
        stringOutFile = so;
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fileInputStream = new FileInputStream(stringInFile);
             FileOutputStream fileOutputStream = new FileOutputStream(stringOutFile)) {
            int c;
            boolean canIWriteSpace = false;
            while ((c = fileInputStream.read()) != -1) {
                if (c > 64 && c < 91 || c > 96 && c < 123) {
                    while (c > 64 && c < 92 || c > 96 && c < 123) {
                        sb.append((char) c);
                        c = fileInputStream.read();
                        canIWriteSpace = true;

                    }

                }
                if (canIWriteSpace){
                    sb.append("\n");
                }
                canIWriteSpace = false;
            }
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    void processCount() {

    }

    public static void main(String[] args) {
        String so = "C:\\!all\\!epam\\school_Autmn_Lapin\\project_homeworks\\homework4IO\\src\\main\\java\\com\\epam\\javacore\\homework\\hw4\\task1\\out.txt";
        String si = "C:\\!all\\!epam\\school_Autmn_Lapin\\project_homeworks\\homework_2_oop\\src\\main\\java\\com\\epam\\javacore\\homework\\hw2\\task_1\\Pen.java";
        new ByteStreamCase(so, si);
    }

}
