package com.epam.javacore.homework.hw3.task3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinderRegExp {
    private final static String ENCODE = "windows-1251";
    private final static String PATTERN_PICTURE = "[Рр]ис\\.\\s?\\w+[^)]";
    private final static String PATTERN_PICTURE_FOR_SIGNATURE = "Рис\\.\\s?\\w+((&nbsp;)|(\\s))[А-Я]";

    private String textForAnalyze;

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

    void find(){
       // StringBuilder sb=new StringBuilder();
        Pattern p = Pattern.compile(PATTERN_PICTURE_FOR_SIGNATURE);
        Matcher m = p.matcher(textForAnalyze);
        while(m.find()){
            System.out.println(m.group(0));
        }

    }
}
