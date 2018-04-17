package com.project.event.server.Dao;

import com.project.event.server.Domain.Dto.RoleDto;
import com.project.event.server.Domain.Report.RoleReport;

import java.util.List;

public interface RoleDao {
    List<RoleReport> getAllRoles ();
    RoleReport getRoleById (Long userId);
    RoleReport updateRole (RoleDto roleDto);
    void deleteRole (Long roleId);
}
