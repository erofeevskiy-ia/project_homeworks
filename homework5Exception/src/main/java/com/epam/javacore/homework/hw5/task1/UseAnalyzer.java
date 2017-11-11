package com.epam.javacore.homework.hw5.task1;

public class UseAnalyzer {
    public static void main(String[] args) {
        String path = "C:\\!all\\!epam\\school_Autmn_Lapin\\project_homeworks\\homework5Exception\\src\\main\\java\\com\\epam\\javacore\\homework\\hw5\\task1";
        //new FileDirectoryAnalyzer(path).start();
        FileDirectoryAnalyzer.seeTheDirectory(path);
        //FileDirectoryAnalyzer.deleteFile(path);
        System.out.println(FileDirectoryAnalyzer.makeDir(path, "newDir"));

    }
}
