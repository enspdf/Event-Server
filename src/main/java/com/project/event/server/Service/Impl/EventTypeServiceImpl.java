package com.project.event.server.Service.Impl;

import com.project.event.server.Dao.EventTypeDao;
import com.project.event.server.Domain.Dto.EventTypeDto;
import com.project.event.server.Domain.Report.EventTypeReport;
import com.project.event.server.Service.EventTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventTypeServiceImpl implements EventTypeService {

    @Autowired
    private EventTypeDao eventTypeDao;

    @Override
    public List<EventTypeReport> getAllEventTypes() {
        return eventTypeDao.getAllEventTypes();
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
    public EventTypeReport updateEventType(EventTypeDto eventTypeDto) {
        return null;
    }

    @Override
    public void deleteEventType(Long id) {

    }
}
