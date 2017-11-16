package com.epam.javacore.homework.hw8.task1;

public class Book {
    private int id;
    private String topic;
    private String author;

    public Book(int id, String topic, String author) {
        this.id = id;
        this.topic = topic;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
