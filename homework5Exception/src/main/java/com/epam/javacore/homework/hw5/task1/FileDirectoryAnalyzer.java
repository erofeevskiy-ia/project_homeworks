package com.epam.javacore.homework.hw5.task1;

import java.io.*;

public class FileDirectoryAnalyzer {
    private FileDirectoryAnalyzer() {
    }

    public static void seeTheDirectory(String pathFile) {
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

    public static boolean deleteFile(String pathFile) {
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


    public static boolean makeDir(String inPath, String nameOfNewDir) {
        String newPath = inPath + "//" + nameOfNewDir;
        File dir = new File(newPath);
        boolean created = dir.mkdir();
        if (created) {
            System.out.println("Directory was created");
            return true;
        } else {
            System.out.println("Directory wan't created");
            return false;
        }
    }

    public static boolean writeInFile(String path, String stringForWriting) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(path), "UTF-16"))) {
            bufferedWriter.write(stringForWriting);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
