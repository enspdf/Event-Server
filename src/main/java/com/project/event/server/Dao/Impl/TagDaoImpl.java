package com.project.event.server.Dao.Impl;

import com.project.event.server.Dao.TagDao;
import com.project.event.server.Domain.Dto.TagDto;
import com.project.event.server.Domain.Report.TagReport;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TagDaoImpl implements TagDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional(readOnly = true)
    public List<TagReport> getAllTags() {
        StringBuilder strSelect = new StringBuilder();
        strSelect.append(" SELECT ");
        strSelect.append(" id AS id, ");
        strSelect.append(" name AS name ");
        strSelect.append(" FROM ");
        strSelect.append(" tblTag ");

        NativeQuery query = sessionFactory.getCurrentSession().createNativeQuery(strSelect.toString());
        query.setResultTransformer(Transformers.aliasToBean(TagReport.class));

        query.addScalar("id", StandardBasicTypes.LONG);
        query.addScalar("name", StandardBasicTypes.STRING);

        return query.list();
    }

    @Override
    public int createTag(TagDto tagDto) {
        return 0;
    }

    @Override
    public TagReport getTagById(Long id) {
        return null;
    }

    @Override
    public TagReport updateTag(TagDto tagDto) {
        return null;
    }

    @Override
    public void deleteTag(Long id) {

    }
}
