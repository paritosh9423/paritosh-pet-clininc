package com.petclinic.paritoshpetclinic.model;
//Created by ppradeep on 08/11/18, 2:17 PM

import java.util.Set;

public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;
    private Set<Pet> petsSet  ;

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
