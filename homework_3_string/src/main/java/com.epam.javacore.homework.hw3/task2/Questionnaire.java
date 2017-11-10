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
        int countQuestions=0;
        for (String s : resourceProp.getResourceBundleQuestion().keySet()) {
                System.out.println(resourceProp.getResourceBundleQuestion().getString(s));
                countQuestions++;
        }

        if ("2".equals(selectLanguage))
            System.out.println("Выберите номер вопроса для вывода ответа(для выхода введите: 000)");
        else
            System.out.println("Enter number of question for printing answer(for exit enter: 000)");

        selectLanguage = new Scanner(System.in).nextLine();
        StringBuilder builderForSearchAnswer = new StringBuilder("answer");
        while(!("000".equals(selectLanguage )||Integer.parseInt(selectLanguage)>countQuestions)) { //FIXME problem with parseInt
            System.out.println(resourceProp.getResourceBundleAnswers()
                    .getString(String.valueOf(builderForSearchAnswer)+selectLanguage));
            selectLanguage = new Scanner(System.in).nextLine();
        }
    }
}

