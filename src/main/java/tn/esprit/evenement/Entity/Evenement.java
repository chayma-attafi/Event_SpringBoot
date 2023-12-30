package tn.esprit.evenement.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "Evenement")
public class Evenement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idEvenement")
    Integer idEvenement;


    String description;

    LocalDate dateDebut;

    LocalDate dateFin;

    float cout;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    List<Logistique> logistiqueList =new ArrayList<>();

    @JsonIgnore
    @ToString.Exclude
    @ManyToMany(mappedBy = "evenementList",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Participant> participantList=new ArrayList<>();

}
