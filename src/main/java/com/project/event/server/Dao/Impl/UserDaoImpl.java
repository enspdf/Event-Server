package com.project.event.server.Dao.Impl;

import com.project.event.server.Dao.UserDao;
import com.project.event.server.Domain.Dto.UserDto;
import com.project.event.server.Domain.Report.UserReport;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<UserReport> getAllUsers() {
        return null;
    }

    @Override
    public UserReport getUserById(Long userId) {
        return null;
    }

    @Override
    public UserReport updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }
}
