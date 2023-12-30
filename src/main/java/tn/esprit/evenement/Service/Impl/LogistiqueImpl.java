package tn.esprit.evenement.Service.Impl;


import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.evenement.Entity.Evenement;
import tn.esprit.evenement.Entity.Logistique;
import tn.esprit.evenement.Repository.EvenementRepository;
import tn.esprit.evenement.Repository.LogistiqueRepository;
import tn.esprit.evenement.Service.Interface.LogistiqueInterface;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Service
public class LogistiqueImpl implements LogistiqueInterface {
    LogistiqueRepository logistiqueRepository;
    EvenementRepository evenementRepository;

    @Override
    public Logistique AjouLogistique(Logistique l) {
        return logistiqueRepository.save(l);
    }

    //si j'ai une relation unidirectionnel je met Transactional au methode
    @Transactional
    @Override
    public Logistique ajoutAffectLogEvnm(Logistique l, String descriptionEvnmt) {
        Evenement ev = evenementRepository.findByDescriptionLike(descriptionEvnmt);
        Logistique logistiquesaved =logistiqueRepository.save(l);
        //affectation
        ev.getLogistiqueList().add(logistiquesaved);

        return logistiquesaved;
    }


    @Override
    public List<Logistique> getLogistiquesDates(Date dateDeb, Date dateFin) {


        return null;
    }
}
