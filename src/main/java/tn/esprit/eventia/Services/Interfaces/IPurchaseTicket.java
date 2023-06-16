package tn.esprit.eventia.Services.Interfaces;

import tn.esprit.eventia.Repository.Entity.PurchaseTicket;
import tn.esprit.eventia.Repository.Repositories.PurchasetikcetRepository;

import java.util.List;
import java.util.Optional;

public interface IPurchaseTicket {
    public PurchaseTicket add(PurchaseTicket purchaseTicket) ;
    public PurchaseTicket edit(PurchaseTicket purchaseTicket);
    public List<PurchaseTicket> selectAll();
    public PurchaseTicket selectById(int PurchaseTicketId);
    public void deleteById(int PurchaseTicketId);
    public void delete(PurchaseTicket purchaseTicket);
    public List<PurchaseTicket> addAll(List<PurchaseTicket> list);
    public void deleteAll();

}
