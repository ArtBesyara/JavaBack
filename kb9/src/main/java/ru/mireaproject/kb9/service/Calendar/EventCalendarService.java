package ru.mireaproject.kb9.service.Calendar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.mireaproject.kb9.dao.Calendar.EventCalendarDAOInterface;
import ru.mireaproject.kb9.entity.Calendar.EventCalendar;

@Service
public class EventCalendarService implements EventCalendarServiceInterface{
    @Autowired
    EventCalendarDAOInterface eventCalendarDAO;

    @Override
    public List<EventCalendar> getAllEvent() {
        return eventCalendarDAO.getAllEvent();
    }

    @Override
    public void addEventCalendar(EventCalendar eventCalendar) {
        eventCalendarDAO.addEventCalendar(eventCalendar);
    }

    @Override
    public void clearEventCalendar() {
        eventCalendarDAO.clearEventCalendar();
    }
    
}
