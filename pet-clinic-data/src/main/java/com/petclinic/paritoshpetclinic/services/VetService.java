package com.petclinic.paritoshpetclinic.services;

import com.petclinic.paritoshpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet save(Vet owner);
    Set<Vet> findAll();
    Vet findByLastName(String lastName);
}
