package tn.esprit.eventia.Services.Implementations;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.eventia.Repository.Entity.PaymentType;
import tn.esprit.eventia.Repository.Entity.PurchaseTicket;
import tn.esprit.eventia.Repository.Repositories.EventRepository;
import tn.esprit.eventia.Repository.Repositories.PurchaseTicketRepository;
import tn.esprit.eventia.Repository.Repositories.UserRepository;
import tn.esprit.eventia.Services.Interfaces.IPurchaseTicket;

import java.util.List;

@Service
@AllArgsConstructor
public class PurchaseTicketService implements IPurchaseTicket {
    @Autowired
    private PurchaseTicketRepository purchaseTicketRepository;


    @Override
    public PurchaseTicket add(PurchaseTicket p) {
        return purchaseTicketRepository.save(p);

    }
    @Override
    public PurchaseTicket edit(PurchaseTicket p) {

        return purchaseTicketRepository.save(p);
    }

    @Override
    public List<PurchaseTicket> selectAll() {
        return purchaseTicketRepository.findAll();
    }

    @Override
    public PurchaseTicket selectById(int PurchaseTicketId) {
        return purchaseTicketRepository.findById(PurchaseTicketId).orElse(null);
    }

    @Override
    public void deleteById(int PurchaseTicketId) {
        purchaseTicketRepository.deleteById(PurchaseTicketId);
    }
}
