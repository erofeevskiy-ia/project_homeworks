package com.epam.javacore.homework.hw8.task1;

public class UseJDBC {
    public static void main(String[] args) {

        Book book_1 = JDBCWork.addBook("Code Complete", "Steve McConnell");
        System.out.println(book_1);

        ConnectionBase.disconnect();
    }
}
