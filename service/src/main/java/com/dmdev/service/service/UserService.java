package com.dmdev.service.service;

import com.dmdev.database.dao.UserDao;
import com.dmdev.service.dto.UserDto;

import javax.swing.text.html.Option;
import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> gerUser(Long id){
        return userDao.findById(id).map(it -> new UserDto());
    }
}
