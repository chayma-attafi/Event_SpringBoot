package tn.esprit.evenement.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.evenement.Entity.Evenement;
import tn.esprit.evenement.Entity.Participant;
import tn.esprit.evenement.Repository.EvenementRepository;
import tn.esprit.evenement.Repository.ParticipantRepository;
import tn.esprit.evenement.Service.Interface.EventInterface;

@AllArgsConstructor
@Service
public class EventImpl implements EventInterface {

    EvenementRepository evenementRepository;
    ParticipantRepository participantRepository;

    @Override
    public Evenement ajoutEvent(Evenement e){
        return evenementRepository.save(e);
    }

    @Override
    public Evenement ajoutAffectEvenParticip(Evenement e, int idParticip) {
        Participant p =participantRepository.findById(idParticip).orElse(null);

        Evenement savedEvenement =evenementRepository.save(e);
        //affectation
        p.getEvenementList().add(savedEvenement);
        participantRepository.save(p);

        return savedEvenement;
    }
}
