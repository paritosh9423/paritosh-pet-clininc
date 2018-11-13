package com.petclinic.paritoshpetclinic.services.springDataJPA;
//Created by ppradeep on 13/11/18, 10:00 PM

import com.petclinic.paritoshpetclinic.model.PetType;
import com.petclinic.paritoshpetclinic.repositories.PetTypeRespository;
import com.petclinic.paritoshpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class PetTypeSpringDataJPAService implements PetTypeService {

    private final PetTypeRespository petTypeRespository;

    public PetTypeSpringDataJPAService(PetTypeRespository petTypeRespository) {
        this.petTypeRespository = petTypeRespository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypeSet = new HashSet<>();
        petTypeRespository.findAll().forEach(petTypeSet::add);

        return petTypeSet;
    }

    @Override
    public PetType findByID(Long aLong) {
        return petTypeRespository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRespository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRespository.delete(object);
    }

    @Override
    public void deletebyID(Long aLong) {
        petTypeRespository.deleteById(aLong);
    }
}
