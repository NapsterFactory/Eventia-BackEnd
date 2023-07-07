package tn.esprit.eventia.Services.Interfaces;

import tn.esprit.eventia.Repository.Entity.PaymentType;
import tn.esprit.eventia.Repository.Entity.PurchaseTicket;

import java.util.List;

public interface IPurchaseTicket {
    PurchaseTicket add(PurchaseTicket p) ;
    PurchaseTicket edit(PurchaseTicket p);
    List<PurchaseTicket> selectAll();
    PurchaseTicket selectById(int PurchaseTicketId);
    void deleteById(int PurchaseTicketId);



}
