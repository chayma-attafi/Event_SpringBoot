package tn.esprit.evenement.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.evenement.Entity.Participant;
import tn.esprit.evenement.Service.Interface.ParticipantInterface;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class ParticipantController {
    ParticipantInterface participantInterface;

    @PutMapping("/ajouterParticipant")
    public Participant ajouterParticipant(Participant p) {
        return participantInterface.ajouterParticipant(p);
    }
}
