package tn.esprit.eventia.Repository.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.eventia.Repository.Entity.Sponsors;

@Repository
public interface SponsorRepository extends JpaRepository<Sponsors,Integer> {
}
