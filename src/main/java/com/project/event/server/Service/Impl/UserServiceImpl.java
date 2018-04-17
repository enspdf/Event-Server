package com.project.event.server.Service.Impl;

import com.project.event.server.Domain.Dto.UserDto;
import com.project.event.server.Domain.Report.UserReport;
import com.project.event.server.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

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
