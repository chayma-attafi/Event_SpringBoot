package tn.esprit.evenement.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Participant")
public class Participant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idParticipant")
    Integer idParticipant;

    String nom,prenom;

    @Enumerated(EnumType.STRING)
    Tache tache;

    @JsonIgnore
    @ToString.Exclude
    @ManyToMany
    List<Evenement> evenementList=new ArrayList<>();
}
