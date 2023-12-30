package tn.esprit.evenement.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
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
    @Column(name ="id")
    Integer id;

    String Description;

    @Temporal(TemporalType.DATE)
    Date dateDebut,DateFin;
    float cout;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany
    List<Logistique> logistiqueList =new ArrayList<>();

    @JsonIgnore
    @ToString.Exclude
    @ManyToMany(mappedBy = "evenementList")
    List<Participant> participantList=new ArrayList<>();

}
