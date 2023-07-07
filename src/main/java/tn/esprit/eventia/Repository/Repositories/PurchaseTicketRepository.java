package tn.esprit.eventia.Repository.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.eventia.Repository.Entity.PaymentType;
import tn.esprit.eventia.Repository.Entity.PurchaseTicket;
import java.util.List;
@Repository
public interface PurchaseTicketRepository extends JpaRepository<PurchaseTicket,Integer> {
    List<PurchaseTicket> findByPaymentType(PaymentType type);

}

