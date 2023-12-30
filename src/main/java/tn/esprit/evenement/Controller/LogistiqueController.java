package tn.esprit.evenement.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.evenement.Entity.Logistique;
import tn.esprit.evenement.Service.Interface.LogistiqueInterface;

@Controller
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class LogistiqueController {
    LogistiqueInterface logistiqueInterface;

    @PutMapping("/AjouLogistique")
    public Logistique AjouLogistique(Logistique l) {
        return logistiqueInterface.AjouLogistique(l);
    }

    @PutMapping("/ajoutAffectLogEvnm/{descriptionEvnmt}")
    public Logistique ajoutAffectLogEvnm(Logistique l, @PathVariable("descriptionEvnmt") String descriptionEvnmt) {
        return logistiqueInterface.ajoutAffectLogEvnm(l, descriptionEvnmt);
    }
}
