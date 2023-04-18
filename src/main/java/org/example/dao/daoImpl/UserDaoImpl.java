package org.example.dao.daoImpl;

import org.example.config.Configuration;
import org.example.dao.UserDao;
import org.example.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {


    @Override
    public void createUserTable() {
        String query = "" +
                "create table if not exists users(" +
                "id serial primary key, " +
                "full_name varchar, " +
                "age int);";
        try (Connection connection = Configuration.connectionToDatabase();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
            System.out.println("users table is created...");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public User getUserById(Long id) {
        User user = null;
        String sql = "select * from users where id = ?;";
        try (Connection connection = Configuration.connectionToDatabase();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getLong("id"));
                user.setFullName(resultSet.getString("full_name"));
                user.setAge(resultSet.getInt("age"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void updateUserInfo(Long id, User user) {
        String sql = "update users " +
                "set full_name = ?, " +
                "age = ? " +
                "where id = ?;";
        try (Connection connection = Configuration.connectionToDatabase();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, user.getFullName());
            preparedStatement.setInt(2, user.getAge());
            preparedStatement.setLong(3, id);
            preparedStatement.executeUpdate();
            System.out.println("user with id: " + id + " successfully updated!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void cleanUserTable() {
    }

    @Override
    public void dropUserTable() {
        String sql = "drop table if exists users;";
        try (Connection connection = Configuration.connectionToDatabase();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("users table is deleted...");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<User> getAllSortedUsers(String ascOrDesc) {
        List<User> sortedUsers = new ArrayList<>();
        String sql = "select * from users order by full_name;";
        try (Connection connection = Configuration.connectionToDatabase();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                sortedUsers.add(new User(
                                resultSet.getLong("id"),
                                resultSet.getString("full_name"),
                                resultSet.getInt("age")
                        )
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return sortedUsers;
    }
}
