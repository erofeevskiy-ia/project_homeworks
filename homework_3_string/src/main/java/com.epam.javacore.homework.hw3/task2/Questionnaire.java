package com.epam.javacore.homework.hw3.task2;

import java.util.Locale;
import java.util.Scanner;

public class Questionnaire {

    public void printQuestionAndAnswers() {
        System.out.println("Choose your language: 1-EN");
        System.out.println("Выберите Ваш язык: 2 - RU");
        ResourceProp resourceProp;
        String selectLanguage = new Scanner(System.in).nextLine();
        switch (selectLanguage) {
            case ("1"):
                resourceProp = new ResourceProp(new Locale("en", "US"));
                break;
            case ("2"):
                resourceProp = new ResourceProp(new Locale("ru", "RU"));
                break;
            default:
                resourceProp = new ResourceProp(new Locale("en", "US"));
                break;
        }
        for (String s : resourceProp.getResourceBundleQuestion().keySet()) {
                System.out.println(resourceProp.getResourceBundleQuestion().getString(s));

        }

        if ("2".equals(selectLanguage))
            System.out.println("Выберите номер вопроса для вывода ответа(для выхода введите: 000)");
        else
            System.out.println("Enter number of question for printing answer(for exit enter: 000)");

        StringBuilder sb = new StringBuilder("answer");
        while(!"000".equals(selectLanguage )) {//FIXME
            selectLanguage = new Scanner(System.in).nextLine();
            System.out.println(resourceProp.getResourceBundleAnswers()
                    .getString(String.valueOf(sb)+selectLanguage));
        }
    }
}

