package ru.mireaproject.kb9.dao.Calendar;

import java.util.List;

import ru.mireaproject.kb9.entity.Calendar.EventCalendar;

public interface EventCalendarDAOInterface {
    List<EventCalendar> getAllEvent();
    void addEventCalendar(EventCalendar eventCalendar);
    void clearEventCalendar();
}
