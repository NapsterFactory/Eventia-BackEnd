package tn.esprit.eventia.Repository.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.eventia.Repository.Entity.Event;

import javax.persistence.Id;

@Repository
public interface EventRepo extends JpaRepository<Event, Long> {


}
