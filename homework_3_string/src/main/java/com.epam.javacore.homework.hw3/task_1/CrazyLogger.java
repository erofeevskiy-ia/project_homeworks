package com.epam.javacore.homework.hw3.task_1;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CrazyLogger  {
   private StringBuilder crazyLog;
   private DateTimeFormatter dateTimeFormatter;

    public CrazyLogger() {
        crazyLog = new StringBuilder();
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd-mm-YYYY : hh-mm – ");
    }

    public String findInfo(String strInfo){
       return null;
   }

   public void addLogMessage(String message){
       LocalDateTime localDateTime = LocalDateTime.now();
       crazyLog.append(localDateTime.format(dateTimeFormatter));
       crazyLog.append(message);
       crazyLog.append("\n");
   }




}
