package com.project.event.server.Service.Impl;

import com.project.event.server.Dao.RoleDao;
import com.project.event.server.Domain.Dto.RoleDto;
import com.project.event.server.Domain.Report.RoleReport;
import com.project.event.server.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<RoleReport> getAllRoles() {
        return roleDao.getAllRoles();
    }

    @Override
    public int createRole(RoleDto roleDto) {
        return 0;
    }

    @Override
    public RoleReport getRoleById(Long userId) {
        return null;
    }

    @Override
    public RoleReport updateRole(RoleDto roleDto) {
        return null;
    }

    @Override
    public void deleteRole(Long roleId) {

    }
}
