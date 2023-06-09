package tn.esprit.eventia.Repository.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.eventia.Repository.Entity.PaymentMethod;

public interface PaymentmethodRepository extends JpaRepository<PaymentMethod,Integer> {
}
