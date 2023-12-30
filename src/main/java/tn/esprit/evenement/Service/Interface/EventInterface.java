package tn.esprit.evenement.Service.Interface;

import tn.esprit.evenement.Entity.Evenement;

public interface EventInterface {

    public Evenement ajoutEvent(Evenement e);
    public Evenement ajoutAffectEvenParticip (Evenement e, int idParticip)  ;
}
