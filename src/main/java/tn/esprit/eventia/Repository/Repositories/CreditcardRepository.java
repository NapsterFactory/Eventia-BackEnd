package tn.esprit.eventia.Repository.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.eventia.Repository.Entity.CreditCard;

public interface CreditcardRepository extends JpaRepository<CreditCard , Integer> {
}
