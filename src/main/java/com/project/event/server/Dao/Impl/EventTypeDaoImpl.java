package com.project.event.server.Dao.Impl;

import com.project.event.server.Dao.EventTypeDao;
import com.project.event.server.Domain.Dto.EventTypeDto;
import com.project.event.server.Domain.Report.EventTypeReport;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EventTypeDaoImpl implements EventTypeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional(readOnly = true)
    public List<EventTypeReport> getAllEventTypes() {
        StringBuilder strSelect = new StringBuilder();
        strSelect.append(" SELECT ");
        strSelect.append(" id AS id, ");
        strSelect.append(" name AS name, ");
        strSelect.append(" active AS active ");
        strSelect.append(" FROM ");
        strSelect.append(" tblEventType ");

        NativeQuery query = sessionFactory.getCurrentSession().createNativeQuery(strSelect.toString());
        query.setResultTransformer(Transformers.aliasToBean(EventTypeReport.class));

        query.addScalar("id", StandardBasicTypes.LONG);
        query.addScalar("name", StandardBasicTypes.STRING);
        query.addScalar("active", StandardBasicTypes.BOOLEAN);

        return query.list();
    }

    @Override
    public int createEventType(EventTypeDto eventTypeDto) {
        return 0;
    }

    @Override
    public EventTypeReport getEventTypeById(Long id) {
        return null;
    }

    @Override
    public int updateEventType(EventTypeDto eventTypeDto) {
        return 0;
    }

    @Override
    public void deleteEventType(Long id) {

    }
}
