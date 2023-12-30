package tn.esprit.evenement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.evenement.Entity.Participant;
@Repository

public interface ParticipantRepository extends JpaRepository<Participant,Integer> {
}
