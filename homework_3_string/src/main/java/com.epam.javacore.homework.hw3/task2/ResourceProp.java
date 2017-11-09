package com.epam.javacore.homework.hw3.task2;



import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceProp {
    private ResourceBundle resourceBundleQuestions;
    private ResourceBundle resourceBundleAnswers;

    public ResourceProp(Locale local) {
        resourceBundleQuestions = ResourceBundle.getBundle("questions",local);
    }

    public ResourceBundle getResourceBundleQuestion(){
        return resourceBundleQuestions;
    }

    public ResourceBundle getResourceBundleAnswers(){
        return resourceBundleAnswers;
    }


}
