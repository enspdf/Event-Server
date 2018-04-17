package com.project.event.server.Dao.Impl;

import com.project.event.server.Dao.RoleDao;
import com.project.event.server.Domain.Dto.RoleDto;
import com.project.event.server.Domain.Report.RoleReport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional(readOnly = true)
    public List<RoleReport> getAllRoles() {
        StringBuilder strSelect = new StringBuilder();
        strSelect.append(" SELECT ");
        strSelect.append(" id AS id, ");
        strSelect.append(" name AS name, ");
        strSelect.append(" active AS active ");
        strSelect.append(" FROM ");
        strSelect.append(" tblRole ");

        NativeQuery query = sessionFactory.getCurrentSession().createNativeQuery(strSelect.toString());
        query.setResultTransformer(Transformers.aliasToBean(RoleReport.class));

        query.addScalar("id", StandardBasicTypes.LONG);
        query.addScalar("name", StandardBasicTypes.STRING);
        query.addScalar("active", StandardBasicTypes.BOOLEAN);

        return query.list();
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
