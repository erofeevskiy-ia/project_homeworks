package com.epam.javacore.homework.hw3.task3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FinderRegExp {
    private String textForAnalyze;
    private final static String ENCODE = "windows-1251";
    public FinderRegExp(String path){
        try {
            textForAnalyze = readFile(path,ENCODE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readFile(String path, String encode) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, Charset.forName(encode));
    }

    public String getFileString(){
        return textForAnalyze;
    }
}
