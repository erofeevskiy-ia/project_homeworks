package com.epam.javacore.homework.hw3.task_1;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CrazyLogger {
    private StringBuilder crazyLog;
    private DateTimeFormatter dateTimeFormatter;

    public CrazyLogger() {
        crazyLog = new StringBuilder();
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd-mm-YYYY : hh-mm – ");
    }

    public String findInfo(String strInfo) {
        StringBuilder sb = new StringBuilder("Result of searching: ");
        final int lengthOfStartSB = sb.length();
        String[] lines = crazyLog.toString().split("\n");
        for (String s : lines) {
            if (s.contains(strInfo)) {
                sb.append(s);
                sb.append("\n");
            }
        }
        return sb.length() > lengthOfStartSB ? sb.toString() : "searching is unsuccessfully";
    }

    public StringBuilder getCrazyLog() {
        return crazyLog;
    }

    public void addLogMessage(String message) {
        LocalDateTime localDateTime = LocalDateTime.now();
        crazyLog.append(localDateTime.format(dateTimeFormatter));
        crazyLog.append(message);
        crazyLog.append("\n");
    }

}
