package ru.mireaproject.kb9.controller.Calendar;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.mireaproject.kb9.dto.Calendar.EventCalendarDTO;
import ru.mireaproject.kb9.service.Calendar.EventCalendarServiceInterface;

@RestController
@RequestMapping("/api/calendar")
public class EventCalendarController {
    @Autowired
    private EventCalendarServiceInterface eventCalendarService;

    @PostMapping("/add")
    public ResponseEntity<EventCalendarDTO> postAddTests(@RequestBody EventCalendarDTO eventCalendarDTO) {
        eventCalendarService.addEventCalendar(eventCalendarDTO.toEventCalendar());
        return ResponseEntity.ok().build();
    }


    @GetMapping
    public List<EventCalendarDTO> eventsCalendar() {
        return this.eventCalendarService.getAllEvent().stream()
        .map(EventCalendarDTO::from)
        .collect(Collectors.toList());
    }

    @GetMapping("/clear")
    public void testClear() {
        this.eventCalendarService.clearEventCalendar();
    }
}
