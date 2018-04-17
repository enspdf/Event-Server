package com.project.event.server.Service;

import com.project.event.server.Domain.Dto.RoleDto;
import com.project.event.server.Domain.Report.RoleReport;

import java.util.List;

public interface RoleService {
    List<RoleReport> getAllRoles ();
    RoleReport getRoleById (Long userId);
    RoleReport updateRole (RoleDto roleDto);
    void deleteRole (Long roleId);
}
