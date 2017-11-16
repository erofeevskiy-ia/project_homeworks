package com.epam.javacore.homework.hw8.task1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCWork {
    private static final String ADD_USER_QUERY = "INSERT INTO book (topic, author) VALUES (?, ?) RETURNING *";
    private static final String GET_BOOK_QUERY_BY_AUTHOR = "SELECT id, topic, author FROM book WHERE  author = ?";
    private static final String GET_BOOK_QUERY_BY_TOPIC_AUTHOR = "SELECT id, topic, author FROM book WHERE topic = ? AND author = ?";
    private static final String GET_BOOK_QUERY_BY_TOPIC = "SELECT id, topic, author FROM book WHERE topic = ?";
    private static final String GET_BOOK_BY_ID_QUERY = "SELECT id, login, about FROM users WHERE id = ?";
    private static final String UPDATE_BOOK_QUERY = "UPDATE book SET (topic, author) = (?, ?) WHERE id = ? RETURNING *";

    public static Book addBook(String topic, String author) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = ConnectionBase.getConnection().prepareStatement(ADD_USER_QUERY);
            preparedStatement.setString(1, topic);
            preparedStatement.setString(2, author);
            resultSet = preparedStatement.executeQuery();
            return ejectBook(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Book getUser(String topic, String author) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = ConnectionBase.getConnection().prepareStatement(GET_BOOK_QUERY_BY_TOPIC_AUTHOR);
            preparedStatement.setString(1, topic);
            preparedStatement.setString(2, author);
            ResultSet resultSet = preparedStatement.executeQuery();
            return ejectBook(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static Book updateUser(Book book) {
        if (book.getId() == 0) throw new IllegalArgumentException("Book must has id");
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = ConnectionBase.getConnection().prepareStatement(UPDATE_BOOK_QUERY);
            preparedStatement.setString(1, book.getTopic());
            preparedStatement.setString(2, book.getAuthor());
            preparedStatement.setInt(3, book.getId());
            ResultSet resultSet = preparedStatement.executeQuery();
            return ejectBook(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    private static Book ejectBook(ResultSet resultSet) throws SQLException {
        if (!resultSet.next()) {
            throw new SQLException("No such user in database.");
        }
        return new Book(resultSet.getInt("id"),
                resultSet.getString("topic"),
                resultSet.getString("author"));
    }
}
