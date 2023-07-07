package tn.esprit.eventia.Interfaces;

import tn.esprit.eventia.Entity.Inscription;

import java.util.List;

public interface InscriptionInterface {
    public Inscription ajouterInscription (Inscription inscription);
    public List<Inscription> AfficheInscription();
    public int SupprimerInscription();

}
