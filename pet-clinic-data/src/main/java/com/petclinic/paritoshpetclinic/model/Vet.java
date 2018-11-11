package com.petclinic.paritoshpetclinic.model;
//Created by ppradeep on 08/11/18, 2:17 PM

import java.util.Set;

public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
