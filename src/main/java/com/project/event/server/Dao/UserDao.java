package com.project.event.server.Dao;

import com.project.event.server.Domain.Dto.UserDto;
import com.project.event.server.Domain.Report.UserReport;

import java.util.List;

public interface UserDao {
    List<UserReport> getAllUsers ();
    UserReport getUserById (Long userId);
    UserReport updateUser (UserDto userDto);
    void deleteUser (Long userId);
}
