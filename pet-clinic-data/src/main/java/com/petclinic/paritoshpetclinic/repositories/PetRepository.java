package com.petclinic.paritoshpetclinic.repositories;
//Created by ppradeep on 13/11/18, 9:15 PM

import com.petclinic.paritoshpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
