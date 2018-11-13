package com.petclinic.paritoshpetclinic.model;
//Created by ppradeep on 08/11/18, 2:17 PM

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name="owners")
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private Set<Pet> petsSet = new HashSet<>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPetsSet() {
        return petsSet;
    }

    public void setPetsSet(Set<Pet> petsSet) {
        this.petsSet = petsSet;
    }
}
