package tn.esprit.evenement.Controller;


import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.evenement.Entity.Evenement;
import tn.esprit.evenement.Service.Interface.EventInterface;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class Eventcontroller {
    EventInterface eventInterface;

    @PutMapping("/ajoutEvent")
    public Evenement ajoutEvent(Evenement e) {
        return eventInterface.ajoutEvent(e);
    }

    @PutMapping("/ajoutAffectEvenParticip/{idParticip}")
    public Evenement ajoutAffectEvenParticip(Evenement e, @PathVariable("idParticip") int idParticip) {
        return eventInterface.ajoutAffectEvenParticip(e, idParticip);
    }
}
