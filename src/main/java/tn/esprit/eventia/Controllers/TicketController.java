package tn.esprit.eventia.Controllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.eventia.Repository.Entity.PurchaseTicket;
import tn.esprit.eventia.Services.Interfaces.IPurchaseTicket;
import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/Tickets")
public class TicketController {
    @Autowired
    private IPurchaseTicket iPurchaseTicket;
    @GetMapping("/test")
    public String testm(){
        System.out.println("hmdlh");
        return "works";
    }

//    @GetMapping("/test1")
//    public String test1(){
//       // return iPurchaseTicket.test1();
//    }

    @GetMapping("/afficherTicketById/{id_purchase_ticket}")
    public PurchaseTicket afficherTicketById(@PathVariable("id_purchase_ticket") int Idpurchaseticket) {
        System.out.println("rappel envoyé");
        return iPurchaseTicket.selectById(Idpurchaseticket);
    }

    @GetMapping("/afficherAllTickets")
    public List<PurchaseTicket> afficherAll() {
        System.out.println("all tickets ");
        return iPurchaseTicket.selectAll();
    }

    @PostMapping("/ajouterTickets")
    public ResponseEntity<PurchaseTicket> addTicket (@RequestBody PurchaseTicket p) {
        System.out.println("rappel envoyéControl");
        iPurchaseTicket.add(p);

        return ResponseEntity.ok(p);
    }

    @DeleteMapping("/SupprimerTicketById/{id_purchase_ticket}")
    public ResponseEntity<String> supprimerTicketById(@PathVariable("id_purchase_ticket") int idpurchaseticket) {
        iPurchaseTicket.deleteById(idpurchaseticket);
        return ResponseEntity.ok("Deleted successfully.");
    }


    @PutMapping("/edit")
    public ResponseEntity<String> editTickets(@RequestBody PurchaseTicket purchaseTicket) {
        iPurchaseTicket.edit(purchaseTicket);
        return ResponseEntity.ok("Update successfully.");
    }

}
