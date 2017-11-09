package com.epam.javacore.homework.hw3.task2;



import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceProp {
    private ResourceBundle resourceBundle;

    public ResourceProp(Locale local) {
        resourceBundle = ResourceBundle.getBundle("questions",local);
    }

    public  String getValue(String key){
        return resourceBundle.getString(key);
    }
}
