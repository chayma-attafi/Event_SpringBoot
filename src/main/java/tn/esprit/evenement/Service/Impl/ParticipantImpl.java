package tn.esprit.evenement.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.evenement.Entity.Participant;
import tn.esprit.evenement.Repository.ParticipantRepository;
import tn.esprit.evenement.Service.Interface.ParticipantInterface;

@AllArgsConstructor
@Service
public class ParticipantImpl implements ParticipantInterface {
    ParticipantRepository participantRepository;
    @Override
    public Participant ajouterParticipant(Participant p) {
        return participantRepository.save(p);
    }
}
