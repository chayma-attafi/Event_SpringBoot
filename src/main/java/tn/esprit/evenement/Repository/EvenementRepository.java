package tn.esprit.evenement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.evenement.Entity.Evenement;

import java.util.Date;
import java.util.List;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement,Integer> {
    Evenement findByDescriptionLike(String descriptionEvnmt);

    List<Evenement> findByDateDebutAndDateFin(Date dateDeb,Date dateFin);

}
