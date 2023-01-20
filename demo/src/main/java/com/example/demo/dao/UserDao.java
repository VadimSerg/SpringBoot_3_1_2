package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;

public interface UserDao {


    void saveUser(User user);
    List<User> getUsers();
    User getUserById(long id);
    void  update(User user);
    void deleteUserById(long id);





}
