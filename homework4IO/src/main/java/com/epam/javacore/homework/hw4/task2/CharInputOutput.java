package com.epam.javacore.homework.hw4.task2;

import com.epam.javacore.homework.hw4.task1.ByteStreamCase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharInputOutput {
    private String stringInFile;
    private String stringOutFile;

    public CharInputOutput(String si, String so) {
        stringInFile = si;
        stringOutFile = so;
        proccess();
    }

    private void proccess() {
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader(stringInFile);
             FileWriter fileWriter = new FileWriter(stringOutFile)) {

            int c;
            boolean canIWriteItInContainer = false;
            while ((c = fileReader.read()) != -1) {
                if (c >='A' && c <='Z' || c>='a' && c < 'z') { //see ASCII-table
                    while (c >='A' && c <='Z' || c>='a' && c < 'z') {
                        sb.append((char) c);//добавляем посимвольно слово в цикле
                        c = fileReader.read();
                        canIWriteItInContainer = true;//метка, что слово кончилось
                    }

                }
                if (canIWriteItInContainer) {
                    sb.append("\n");
                }
                canIWriteItInContainer = false;
            }
            String[] lines = sb.toString().split("\n");
            int sumOfWords = 0;
            //проверяем, все слова из билдера на принадлежность к ключевым и если так, то сразу записываем в файл
            for (String s : lines) {
                if (ByteStreamCase.KEY_WORDS_JAVA.contains(s)) {
                    for (int i = 0; i < s.length(); i++) {
                        fileWriter.write(s.charAt(i));
                        if (i == s.length() - 1) {
                            fileWriter.write('\n');
                            sumOfWords++;
                        }
                    }
                }
            }
            String stringNumOFWords = Integer.toString(sumOfWords);
            for (int i = 0; i < stringNumOFWords.length(); i++) {
                fileWriter.write(stringNumOFWords.charAt(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String so = "homework4IO\\src\\main\\java\\com\\epam\\javacore\\homework\\hw4\\task2\\out.txt";
        String si = "homework_2_oop\\src\\main\\java\\com\\epam\\javacore\\homework\\hw2\\task_3\\SetOfNovice.java";
        new CharInputOutput(si, so);
    }
}
