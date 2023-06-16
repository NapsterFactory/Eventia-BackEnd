package tn.esprit.eventia.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.eventia.Repository.Entity.PurchaseTicket;
import tn.esprit.eventia.Services.Interfaces.IPurchaseTicket;
import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/Tickets")
public class TicketController {
    private IPurchaseTicket iPurchaseTicket;

    @GetMapping("/afficherTicketById/{idpurchaseticket}")
    public PurchaseTicket afficherTicketById(@PathVariable("idpurchaseticket") int Idpurchaseticket) {

        return iPurchaseTicket.selectById(Idpurchaseticket);
    }

    @GetMapping("/afficherAllTickets")
    public List<PurchaseTicket> afficherAll() {
        System.out.println("rappel envoyé");
        return iPurchaseTicket.selectAll();
    }

    @PostMapping("/ajouterTickets")
    public ResponseEntity<String> addTicket (@RequestBody PurchaseTicket purchaseTicket) {

        iPurchaseTicket.add(purchaseTicket);

        return ResponseEntity.ok("Added successfully.");
    }
    @PutMapping("/ModifierTickets")
    public ResponseEntity<String> editTicket(@RequestBody PurchaseTicket ticket) {
        iPurchaseTicket.edit(ticket);
        System.out.println("MODIFIED");
        return ResponseEntity.ok("Edited successfully.");
    }

    @DeleteMapping("SupprimerTicket")
    public ResponseEntity<String> delete(@RequestBody PurchaseTicket ticket) {
        iPurchaseTicket.delete(ticket);
        return ResponseEntity.ok("Deleted successfully.");
    }

    @DeleteMapping("/SupprimerTicketById")
    public ResponseEntity<String> supprimerTicketById(@RequestParam int idpurchaseticket) {
        iPurchaseTicket.deleteById(idpurchaseticket);
        return ResponseEntity.ok("Deleted successfully.");
    }

    @DeleteMapping("/SupprimerAllTickets")
    public ResponseEntity<String> supprimerAllTickets() {
        iPurchaseTicket.deleteAll();
        return ResponseEntity.ok("Deleted successfully.");
    }

}
