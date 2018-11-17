package com.petclinic.paritoshpetclinic.model;
//Created by ppradeep on 08/11/18, 2:17 PM

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;
@Setter
@Getter
@Builder
@AllArgsConstructor
@Entity
@Table(name="owners")
public class Owner extends Person {
    @Builder
    public Owner(Long id, String firstname,String lastName,String address,String city
    ,String telephone,Set<Pet> petsSet) {

        super(id,firstname,lastName);
        this.address = address ;
        this.city = city;
        this.telephone = telephone ;
        this.petsSet = petsSet;

    }
public Owner(){

}
    private String address;
    private String city;
    private String telephone;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private Set<Pet> petsSet = new HashSet<>();

}
