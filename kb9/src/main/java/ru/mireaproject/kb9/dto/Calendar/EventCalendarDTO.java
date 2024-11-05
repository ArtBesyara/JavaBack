package ru.mireaproject.kb9.dto.Calendar;


import java.net.URL;
import java.time.LocalDate;

import lombok.Data;
import ru.mireaproject.kb9.entity.Calendar.EventCalendar;

@Data
public class EventCalendarDTO {
    private long id;
    private String name;
    private LocalDate date;
    private String description;
    private URL url;

    public static EventCalendarDTO from(EventCalendar eventCalendar){
        EventCalendarDTO eventCalendarDTO = new EventCalendarDTO();
        eventCalendarDTO.setId(eventCalendar.getId());
        eventCalendarDTO.setName(eventCalendar.getName());
        eventCalendarDTO.setDate(eventCalendar.getDate());
        eventCalendarDTO.setDescription(eventCalendar.getDescription());
        eventCalendarDTO.setUrl(eventCalendar.getUrl());
        
        
        return eventCalendarDTO;
        
    }
}
