package com.project.event.server.Service;

import com.project.event.server.Domain.Dto.UserDto;
import com.project.event.server.Domain.Report.UserReport;

import java.util.List;

public interface UserService {
    List<UserReport> getAllUsers ();
    UserReport getUserById (Long userId);
    UserReport updateUser (UserDto userDto);
    void deleteUser (Long userId);
}
