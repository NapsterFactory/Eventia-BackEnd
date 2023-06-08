package tn.esprit.eventia.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.eventia.Repository.Entity.Sponsors;
import tn.esprit.eventia.Services.Interfaces.SponsorService;

import java.util.List;

@RestController
public class SponsorController {
    @Autowired
    private SponsorService sponsorService;
    @PostMapping("/sponsors")
    public Sponsors addSponsors(@RequestBody Sponsors sponsors){
        return sponsorService.addSponsors(sponsors);
    }
    @GetMapping("/sponsors")
    public List<Sponsors> GetSponsorsList(){
        return sponsorService.GetSponsorsList();
    }

    @PutMapping("/sponsors/{id}")
    public String deleteSponsorById(@PathVariable("id") Integer id){
        sponsorService.deleteSponsors(id);
        return "Success";
    }

}
