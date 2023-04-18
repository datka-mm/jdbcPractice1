package org.example.service.serviceImpl;

import org.example.dao.UserDao;
import org.example.dao.daoImpl.UserDaoImpl;
import org.example.model.User;
import org.example.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public void createUserTable() {
        userDao.createUserTable();
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void updateUserInfo(Long id, User user) {
        userDao.updateUserInfo(id, user);
    }

    @Override
    public void cleanUserTable() {

    }

    @Override
    public void dropUserTable() {
        userDao.dropUserTable();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<User> getAllSortedUsers(String ascOrDesc) {
        return userDao.getAllSortedUsers(ascOrDesc);
    }
}
