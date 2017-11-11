package com.epam.javacore.homework.hw5.task2;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyAnalyzer {

    public static String getValue(String filePath, String key){
        Properties properties = new Properties();
        try(InputStream is = new FileInputStream(filePath)) {
            properties.load(is);
            return properties.getProperty(key);
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFound");
            return null;
        } catch (IOException e) {
            System.err.println("IOException ");
            return null;
        }
    }

}
