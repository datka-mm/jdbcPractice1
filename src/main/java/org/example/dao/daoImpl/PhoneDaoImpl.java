package org.example.dao.daoImpl;

import org.example.config.Configuration;
import org.example.dao.PhoneDao;
import org.example.model.Phone;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PhoneDaoImpl implements PhoneDao {

    @Override
    public void createPhoneTable() {
        String sql = "create table phones (" +
                "id serial primary key," +
                "model varchar," +
                "brand varchar," +
                "price int," +
                "user_id int references users(id));";
        try (Connection connection = Configuration.connectionToDatabase();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("Phone table create....");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void savePhone(Phone phone) {

    }

    @Override
    public void updatePhone(Long id, Phone phone) {

    }

    @Override
    public List<Phone> getAllUserPhone(Long userId) {
        return null;
    }

    @Override
    public List<Phone> getAllUserSortedUserPhone(Long userId, String ascOrDesc) {
        return null;
    }

    @Override
    public Phone getYoungerUserPhone() {
        return null;
    }

    @Override
    public Phone getPhoneById(Long id) {
        return null;
    }

    @Override
    public void deletePhoneById(Long id) {

    }
}
