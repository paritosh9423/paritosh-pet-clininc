package com.petclinic.paritoshpetclinic.model;
//Created by ppradeep on 08/11/18, 2:17 PM

import java.util.Set;

public class Owner extends Person {

    private Set<Pet> petsSet  ;

    public Set<Pet> getPetsSet() {
        return petsSet;
    }

    public void setPetsSet(Set<Pet> petsSet) {
        this.petsSet = petsSet;
    }
}
