package tn.esprit.eventia.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.eventia.Entity.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription, Integer> {
}
