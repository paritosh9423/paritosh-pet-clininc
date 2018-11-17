package com.petclinic.paritoshpetclinic.model;
//Created by ppradeep on 08/11/18, 2:20 PM

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="pets")
public class Pet extends BaseEntity {


    private String petName;
    @ManyToOne
    @JoinColumn(name="type_id")
    private PetType petType;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
    private LocalDate birthDate;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "pet")
    private Set<Visit> visitSet = new HashSet<>();

}
