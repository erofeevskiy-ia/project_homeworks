package com.epam.javacore.homework.hw5.task1;

import java.io.File;
import java.util.Scanner;

public class FileDirectoryAnalyzer {
   /* private String path;
    private File file;

    public FileDirectoryAnalyzer(String path) {
        this.path = path;
        file = new File(path);
    }*/

    static public void seeTheDirectory(String pathFile) {
        File file = new File(pathFile);
        System.out.println("You are in " + pathFile);
        if (file.isDirectory()) {
            System.out.println("This catalog contains:");
            for (File item : file.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + "\tкаталог");
                } else {
                    System.out.println(item.getName() + "\tфайл");
                }
            }
        }
    }

    static public boolean deleteFile(String pathFile) {
        File file = new File(pathFile);
        boolean isDirectory = false;
        if (file.isDirectory()) isDirectory = true;
        boolean deleted = file.delete();
        if (deleted) {
            if (isDirectory)
                System.out.println("Directory was deleted");
            else
                System.out.println("File was deleted");
        } else {
            System.out.println("File wasn't deleted");
            return false;
        }
        return true;
    }

  /*  public void start() {
        Scanner in = new Scanner(System.in);
        int choice;
        while ((choice = in.nextInt()) != 0) {
            System.out.println("write '1' to make file");
            System.out.println("write '2' to make file");
            System.out.println("write '3' to delete file");
            System.out.println("write '0' to exit ");
        }
    }*/

    public static boolean makeDir(String inPath, String nameOfNewDir) {
        File dir = new File(inPath + "//" + nameOfNewDir);
        boolean created = dir.mkdir();
        if (created) {
            System.out.println("Directory was created");
            return true;
        } else {
            System.out.println("Directory wan't created");
            return false;
        }
    }
}
