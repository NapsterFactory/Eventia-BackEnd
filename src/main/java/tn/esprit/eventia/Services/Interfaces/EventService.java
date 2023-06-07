package tn.esprit.eventia.Services.Interfaces;

import tn.esprit.eventia.Repository.Entity.Event;

import java.util.List;

public interface EventService {
    Event addEvent(Event event);
    List<Event> GetEventList();

    Event updateEvent(Event event,Long eventId);

    void deleteEvent(long evenId);


}
