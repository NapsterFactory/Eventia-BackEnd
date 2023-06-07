package tn.esprit.eventia.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.eventia.Repository.Entity.Event;
import tn.esprit.eventia.Services.Interfaces.EventService;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("/events")
    public Event addEvent(@RequestBody Event event){
        return eventService.addEvent(event);
    }

    @GetMapping("/events")
    public List<Event> getEventList(){
        return eventService.GetEventList();
    }

    @PutMapping("/events/{id}")
    public String deleteEventById(@PathVariable("id") Long eventId){
        eventService.deleteEvent(eventId);
        return "Success";
    }


}
