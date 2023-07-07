package tn.esprit.eventia.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.eventia.Entity.Inscription;
import tn.esprit.eventia.Interfaces.InscriptionInterface;
import tn.esprit.eventia.Repository.InscriptionRepository;

import java.util.List;

@Service
public class InscriptionService implements InscriptionInterface {

    @Autowired
    InscriptionRepository inscriptionRepository;
    @Override
    public Inscription ajouterInscription(Inscription inscription) {
         return inscriptionRepository.save(inscription);

    }

    @Override
    public List<Inscription> AfficheInscription() {
   return inscriptionRepository.findAll();
    }

    @Override
    public int SupprimerInscription() {
        inscriptionRepository.deleteAll();
        return 1;
    }



}
