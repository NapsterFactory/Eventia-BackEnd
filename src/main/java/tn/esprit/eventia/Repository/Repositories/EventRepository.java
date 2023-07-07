package tn.esprit.eventia.Repository.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.eventia.Repository.Entity.Event;
import tn.esprit.eventia.Repository.Entity.PurchaseTicket;
@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
}
