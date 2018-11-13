package com.petclinic.paritoshpetclinic.services.springDataJPA;
//Created by ppradeep on 13/11/18, 10:05 PM

import com.petclinic.paritoshpetclinic.model.Pet;
import com.petclinic.paritoshpetclinic.repositories.PetRepository;
import com.petclinic.paritoshpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class PetSpringDataJPAService implements PetService {

   private final PetRepository petRepository;

    public PetSpringDataJPAService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> petSet = new HashSet<>();
        petRepository.findAll().forEach(petSet::add);

        return petSet;
    }

    @Override
    public Pet findByID(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deletebyID(Long aLong) {
        petRepository.deleteById(aLong);
    }
}

