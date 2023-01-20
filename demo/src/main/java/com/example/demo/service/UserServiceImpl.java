package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao userDao;


    public UserServiceImpl(UserDao userDao) {
       this.userDao = userDao;
    }


    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }


    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }


    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }


    @Override
    public void update(User user) {
        userDao.update(user);
    }


    @Override
    public void deleteUserById(long id) {
        userDao.deleteUserById(id);
    }

}
