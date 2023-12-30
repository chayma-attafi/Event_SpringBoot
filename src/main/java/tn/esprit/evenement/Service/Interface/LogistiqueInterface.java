package tn.esprit.evenement.Service.Interface;

import tn.esprit.evenement.Entity.Logistique;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface LogistiqueInterface {

    public Logistique AjouLogistique(Logistique l);
    public Logistique ajoutAffectLogEvnm (Logistique l, String descriptionEvnmt);

    public List<Logistique> getLogistiquesDates (Date dateDeb, Date dateFin);
}
