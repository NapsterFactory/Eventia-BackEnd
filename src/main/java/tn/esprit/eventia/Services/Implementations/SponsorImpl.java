package tn.esprit.eventia.Services.Implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.eventia.Repository.Entity.Sponsors;
import tn.esprit.eventia.Repository.Repositories.SponsorRepository;
import tn.esprit.eventia.Services.Interfaces.SponsorService;

import java.util.List;
import java.util.Objects;

@Service
public class SponsorImpl implements SponsorService {
    @Autowired
    private SponsorRepository sponsorRepository;
    @Override
    public Sponsors addSponsors(Sponsors sponsors) {
        return sponsorRepository.save(sponsors);
    }

    @Override
    public List<Sponsors> GetSponsorsList() {
        return  sponsorRepository.findAll();
    }

    @Override
    public Sponsors updateSponsors(Sponsors sponsors, Integer id) {
        Sponsors sp= sponsorRepository.findById(id).get();

        if (Objects.nonNull(sponsors.getName()) && !"".equalsIgnoreCase(sponsors.getName())) {
            sp.setName(sponsors.getName());
        }
        if (Objects.nonNull(sponsors.getPhonenumber()) && !"".equalsIgnoreCase(String.valueOf(sponsors.getPhonenumber()))) {sp.setPhonenumber(sponsors.getPhonenumber());
        }
        return sponsorRepository.save(sp);
    }

    @Override
    public void deleteSponsors(Integer id) {

    }
}
