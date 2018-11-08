package com.petclinic.paritoshpetclinic.services;

import com.petclinic.paritoshpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet save(Pet owner);
    Set<Pet> findAll();
    Pet findByLastName(String lastName);
}
