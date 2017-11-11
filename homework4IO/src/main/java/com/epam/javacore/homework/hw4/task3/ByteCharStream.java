package com.epam.javacore.homework.hw4.task3;

import java.io.*;

public class ByteCharStream {
    private String pathStringInFile;
    private String pathStringOutFile;

    public ByteCharStream(String si, String so) {
        pathStringInFile = si;
        pathStringOutFile = so;
        process();
    }

    private void process() {
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(pathStringInFile), "UTF-8"));
             BufferedWriter bufferedWriter = new BufferedWriter(
                     new OutputStreamWriter(
                             new FileOutputStream(pathStringOutFile), "UTF-16"))) {
            String tmp="";
            while((tmp=bufferedReader.readLine())!=null){
                bufferedWriter.write(tmp);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        String si = "homework4IO\\src\\main\\java\\com\\epam\\javacore\\homework\\hw4\\task3\\in";
        String so = "homework4IO\\src\\main\\java\\com\\epam\\javacore\\homework\\hw4\\task3\\out.txt";
        new ByteCharStream(si, so);
    }
}
