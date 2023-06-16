package tn.esprit.eventia.Services.Implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.eventia.Repository.Entity.PurchaseTicket;
import tn.esprit.eventia.Repository.Entity.User;
import tn.esprit.eventia.Repository.Repositories.EventRepository;
import tn.esprit.eventia.Repository.Repositories.PurchasetikcetRepository;
import tn.esprit.eventia.Repository.Repositories.UserRepository;
import tn.esprit.eventia.Services.Interfaces.IPurchaseTicket;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseTicketService implements IPurchaseTicket {
    private PurchasetikcetRepository purchasetikcetRepository;
    private UserRepository userRepository;
    private EventRepository eventRepository;

    @Override
    public PurchaseTicket add(PurchaseTicket purchaseTicket) {
        return purchasetikcetRepository.save(purchaseTicket);
    }

    @Override
    public PurchaseTicket edit(PurchaseTicket purchaseTicket) {
        return purchasetikcetRepository.save(purchaseTicket);
    }

    @Override
    public List<PurchaseTicket> selectAll() {
        return purchasetikcetRepository.findAll();
    }

    @Override
    public PurchaseTicket selectById(int PurchaseTicketId) {
        return purchasetikcetRepository.findById(PurchaseTicketId).get();
    }

    @Override
    public void deleteById(int PurchaseTicketId) {
        purchasetikcetRepository.deleteById(PurchaseTicketId);
    }

    @Override
    public void delete(PurchaseTicket purchaseTicket) {
        purchasetikcetRepository.delete(purchaseTicket);
    }

    @Override
    public List<PurchaseTicket> addAll(List<PurchaseTicket> list) {
        return purchasetikcetRepository.saveAll(list);
    }
    @Override
    public void deleteAll() {
        purchasetikcetRepository.deleteAll();
    }

}
