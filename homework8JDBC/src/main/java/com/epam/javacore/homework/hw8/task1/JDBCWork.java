package com.epam.javacore.homework.hw8.task1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCWork {
    private static final String ADD_USER_QUERY = "INSERT INTO book (topic, author) VALUES (?, ?) RETURNING *";

    public static Book addBook(String topic, String author) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = ConnectionBase.getConnection().prepareStatement(ADD_USER_QUERY);
            preparedStatement.setString(1, topic);
            preparedStatement.setString(2, author);
            resultSet = preparedStatement.executeQuery();
            return getBook(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Book getBook(ResultSet resultSet) throws SQLException {
        if (!resultSet.next()) {
            throw new SQLException("No such user in database.");
        }
        return new Book(resultSet.getInt("id"),
                resultSet.getString("topic"),
                resultSet.getString("author"));
    }
}
