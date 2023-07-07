package tn.esprit.eventia.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.eventia.Entity.Inscription;
import tn.esprit.eventia.Interfaces.InscriptionInterface;
import tn.esprit.eventia.Service.InscriptionService;

import java.util.List;

@RestController
@RequestMapping("/inscription")
@CrossOrigin("*")

public class InscriptionController {
    @Autowired
    private InscriptionInterface inscriptionService;
    @PostMapping("/new")
    public Inscription AddInscription(@RequestBody Inscription inscription){
        return inscriptionService.ajouterInscription(inscription);
    }
    @GetMapping("/inscription")
    public List<Inscription> GetInscriptionList(){
        return inscriptionService.AfficheInscription();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteInscription(@PathVariable("id") Long id){
        inscriptionService.SupprimerInscription();
        return "Success";
    }

}
