package tn.esprit.eventia.Services.Implementations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.eventia.Repository.Entity.Event;
import tn.esprit.eventia.Repository.Repositories.EventRepo;
import tn.esprit.eventia.Services.Interfaces.EventService;
import java.util.List;
import java.util.Objects;

@Service
public class EventServiceImpl  implements EventService {
    @Autowired
    private EventRepo eventRepo;
    @Override
    public Event addEvent(Event event) {
        return eventRepo.save(event);
    }

    @Override
    public List<Event> GetEventList() {
        return  eventRepo.findAll();
    }

    @Override
    public Event updateEvent(Event event, Long eventId) {
        Event ev= eventRepo.findById(eventId).get();

        if (Objects.nonNull(event.getName()) && !"".equalsIgnoreCase(event.getName())) {
                ev.setName(event.getName());
        }

        if (Objects.nonNull(event.getStarting_date()) && !"".equalsIgnoreCase(String.valueOf(event.getStarting_date()))) {
            ev.setStarting_date(
                    event.getStarting_date());
        }

        if (Objects.nonNull(event.getEnd_date()) && !"".equalsIgnoreCase(String.valueOf(event.getEnd_date()))) {
            ev.setEnd_date(event.getEnd_date());
        }

        if (Objects.nonNull(event.getNumber()) && !"".equalsIgnoreCase(String.valueOf(event.getNumber()))) {ev.setNumber(event.getNumber());
        }
        return eventRepo.save(ev);
    }

    @Override
    public void deleteEvent(long eventId) {
        eventRepo.deleteById(eventId);

    }
}
