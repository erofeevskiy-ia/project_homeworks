package com.epam.javacore.homework.hw6.task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class PropertiesAnalyzer {
    private Map<String, String> containerResult = new HashMap<>(); //hashSet cannot contain duplicates with equals keys.

    public String getValue(String filePath, String key) {
        Properties properties = new Properties();
        try (InputStream is = new FileInputStream(filePath)) {
            properties.load(is);
            containerResult.put(key, properties.getProperty(key));
            return getValueFromMap(key);
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFound");
            return null;
        } catch (IOException e) {
            System.err.println("IOException ");
            return null;
        }
    }

    private String getValueFromMap(String key) {
        return containerResult.get(key);
    }

/*    public static void main(String[] args) {

      PropertiesAnalyzer p = new PropertiesAnalyzer();
      String st = "homework5Exception\\src\\main\\java\\com\\epam\\javacore\\homework\\hw5\\task2\\questions_en_US.properties";
        System.out.println(p.getValue(st, "question2"));
        System.out.println(p.getValue(st, "question5"));

    }*/
}
