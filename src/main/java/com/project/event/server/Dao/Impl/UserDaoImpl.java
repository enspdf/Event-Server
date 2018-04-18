package com.project.event.server.Dao.Impl;

import com.project.event.server.Dao.UserDao;
import com.project.event.server.Domain.Dto.UserDto;
import com.project.event.server.Domain.Report.UserReport;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional(readOnly = true)
    public List<UserReport> getAllUsers() {
        StringBuilder strSelect = new StringBuilder();
        strSelect.append(" SELECT ");
        strSelect.append(" id AS id, ");
        strSelect.append(" firstName AS firstName, ");
        strSelect.append(" lastName AS lastName, ");
        strSelect.append(" login AS login, ");
        strSelect.append(" email AS email, ");
        strSelect.append(" phone AS phone, ");
        strSelect.append(" active AS active, ");
        strSelect.append(" idRole AS idRole, ");
        strSelect.append(" creationDate AS creationDate ");
        strSelect.append(" FROM ");
        strSelect.append(" tblUser ");

        NativeQuery query = sessionFactory.getCurrentSession().createNativeQuery(strSelect.toString());
        query.setResultTransformer(Transformers.aliasToBean(UserReport.class));

        query.addScalar("id", StandardBasicTypes.LONG);
        query.addScalar("firstName", StandardBasicTypes.STRING);
        query.addScalar("lasName", StandardBasicTypes.STRING);
        query.addScalar("login", StandardBasicTypes.STRING);
        query.addScalar("email", StandardBasicTypes.STRING);
        query.addScalar("phone", StandardBasicTypes.STRING);
        query.addScalar("active", StandardBasicTypes.BOOLEAN);
        query.addScalar("idRole", StandardBasicTypes.LONG);
        query.addScalar("creationDate", StandardBasicTypes.DATE);

        return query.list();
    }

    @Override
    public int createUser(UserDto userDto) {
        return 0;
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
