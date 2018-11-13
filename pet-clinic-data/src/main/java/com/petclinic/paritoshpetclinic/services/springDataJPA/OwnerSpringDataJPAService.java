package com.petclinic.paritoshpetclinic.services.springDataJPA;
//Created by ppradeep on 13/11/18, 9:26 PM

import com.petclinic.paritoshpetclinic.model.Owner;
import com.petclinic.paritoshpetclinic.repositories.OwnerRepository;
import com.petclinic.paritoshpetclinic.repositories.PetRepository;
import com.petclinic.paritoshpetclinic.repositories.PetTypeRespository;
import com.petclinic.paritoshpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSpringDataJPAService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRespository petTypeRespository;

    public OwnerSpringDataJPAService(OwnerRepository ownerRepository, PetRepository petRepository,
                                     PetTypeRespository petTypeRespository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRespository = petTypeRespository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> ownerSet = new HashSet<>();

        ownerRepository.findAll().forEach(ownerSet::add);
        return  ownerSet;
    }

    @Override
    public Owner findByID(Long aLong) {

        return ownerRepository.findById(aLong).orElse(null);

    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deletebyID(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
