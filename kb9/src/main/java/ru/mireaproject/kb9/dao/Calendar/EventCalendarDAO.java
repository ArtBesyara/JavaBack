package ru.mireaproject.kb9.dao.Calendar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ru.mireaproject.kb9.dao.repository.Calendar.EventCalendarRepository;
import ru.mireaproject.kb9.entity.Calendar.EventCalendar;

@Repository
public class EventCalendarDAO implements EventCalendarDAOInterface{

    @Autowired
    EventCalendarRepository eventCalendarRepository;

    @Override
    public List<EventCalendar> getAllEvent() {
        return eventCalendarRepository.findAll();
    }

    @Override
    public void addEventCalendar(EventCalendar eventCalendar) {
       eventCalendarRepository.save(eventCalendar);
    }

    @Override
    public void clearEventCalendar() {
       eventCalendarRepository.deleteAll();
    }
    
}
