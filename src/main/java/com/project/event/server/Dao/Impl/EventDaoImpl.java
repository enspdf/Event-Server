package com.project.event.server.Dao.Impl;

import com.project.event.server.Dao.EventDao;
import com.project.event.server.Domain.Dto.EventDto;
import com.project.event.server.Domain.Report.EventReport;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EventDaoImpl implements EventDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<EventReport> getAllEvents() {
        StringBuilder strSelect = new StringBuilder();
        strSelect.append(" SELECT ");
        strSelect.append(" id AS id, ");
        strSelect.append(" title AS title, ");
        strSelect.append(" description AS description, ");
        strSelect.append(" longitude AS longitude, ");
        strSelect.append(" latitude AS latitude, ");
        strSelect.append(" date AS date, ");
        strSelect.append(" address AS address, ");
        strSelect.append(" active AS active, ");
        strSelect.append(" cost AS cost, ");
        strSelect.append(" creationDate AS creationDate, ");
        strSelect.append(" updateDate AS updateDate, ");
        strSelect.append(" idUser AS userId, ");
        strSelect.append(" idEventType as eventTypeId, ");
        strSelect.append(" published AS publishedActive, ");
        strSelect.append(" publishedDate AS publishedDate ");
        strSelect.append(" FROM ");
        strSelect.append(" tblEvent ");

        NativeQuery query = sessionFactory.getCurrentSession().createNativeQuery(strSelect.toString());
        query.setResultTransformer(Transformers.aliasToBean(EventReport.class));

        query.addScalar("id", StandardBasicTypes.LONG);
        query.addScalar("title", StandardBasicTypes.STRING);
        query.addScalar("description", StandardBasicTypes.STRING);
        query.addScalar("longitude", StandardBasicTypes.STRING);
        query.addScalar("latitude", StandardBasicTypes.STRING);
        query.addScalar("date", StandardBasicTypes.DATE);
        query.addScalar("address", StandardBasicTypes.STRING);
        query.addScalar("active", StandardBasicTypes.BOOLEAN);
        query.addScalar("cost", StandardBasicTypes.DOUBLE);
        query.addScalar("creationDate", StandardBasicTypes.DATE);
        query.addScalar("updateDate", StandardBasicTypes.DATE);
        query.addScalar("userId", StandardBasicTypes.LONG);
        query.addScalar("eventTypeId", StandardBasicTypes.LONG);
        query.addScalar("publishedActive", StandardBasicTypes.BOOLEAN);
        query.addScalar("publishedDate", StandardBasicTypes.DATE);

        return query.list();
    }

    @Override
    public int createEvenInt(EventDto eventDto) {
        return 0;
    }

    @Override
    public EventReport getEventById(Long id) {
        return null;
    }

    @Override
    public EventReport updateEvent(EventDto eventDto) {
        return null;
    }

    @Override
    public void deleteEvent(Long id) {

    }
}
