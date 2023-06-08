package tn.esprit.eventia.Services.Interfaces;

import tn.esprit.eventia.Repository.Entity.Sponsors;

import java.util.List;

public interface SponsorService {
    Sponsors addSponsors(Sponsors sponsors);
    List<Sponsors> GetSponsorsList();

    Sponsors updateSponsors(Sponsors sponsors,Integer id);

    void deleteSponsors(Integer id);
}
