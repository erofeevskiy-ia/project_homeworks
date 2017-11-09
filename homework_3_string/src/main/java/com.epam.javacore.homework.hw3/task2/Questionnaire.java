package com.epam.javacore.homework.hw3.task2;

import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Questionnaire {

    public void printQuestion() {
        System.out.println("Choose your language: 1-EN");
        System.out.println("Выберите Ваш язык: 2 - RU");
        ResourceProp res;
        String selectLanguage = new Scanner(System.in).nextLine();
        switch (selectLanguage) {
            case ("1"):
                res = new ResourceProp(new Locale("en", "US"));
                break;
            case ("2"):
                res = new ResourceProp(new Locale("ru", "RU"));
                break;
            default:
                res = new ResourceProp(new Locale("en", "US"));
                break;
        }
        for(String s: res.getResourceBundleQuestion().keySet()){
            try {
                System.out.println(res.getResourceBundleQuestion().getString(s).getBytes("ISO-8859-1"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

    }
}

