package ru.mireaproject.kb9.dao.repository.Calendar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.mireaproject.kb9.entity.Calendar.EventCalendar;

@Repository
public interface EventCalendarRepository extends JpaRepository<EventCalendar, Long>{

    
}
