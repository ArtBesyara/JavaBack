package ru.mireaproject.kb9.service.Calendar;

import java.util.List;

import ru.mireaproject.kb9.entity.Calendar.EventCalendar;

public interface EventCalendarServiceInterface {
    List<EventCalendar> getAllEvent();
    void addEventCalendar(EventCalendar eventCalendar);
    void clearEventCalendar();
}
