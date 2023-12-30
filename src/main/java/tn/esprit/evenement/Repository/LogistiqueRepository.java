package tn.esprit.evenement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.evenement.Entity.Logistique;
@Repository

public interface LogistiqueRepository extends JpaRepository<Logistique,Integer> {

}
