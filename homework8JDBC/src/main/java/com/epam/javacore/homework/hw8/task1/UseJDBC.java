package com.epam.javacore.homework.hw8.task1;

public class UseJDBC {
    public static void main(String[] args) {

        //Book book_1 = JDBCWork.addBook("Code Complete", "Steve McConnell");
        //System.out.println(book_1);
        Book book_2 = JDBCWork.getUser("Code Complete", "Steve McConnell");
        System.out.println(book_2);
        book_2.setAuthor("Пушкин");
        book_2.setTopic("Евгений Онегин");
        book_2.setId(2);
        JDBCWork.updateUser(book_2);
        System.out.println(book_2);
        Book book_3 = JDBCWork.deleteUser();
        System.out.println(book_3);

        ConnectionBase.disconnect();
    }
}
