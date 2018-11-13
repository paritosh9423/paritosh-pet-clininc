package com.petclinic.paritoshpetclinic.repositories;

import com.petclinic.paritoshpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRespository extends CrudRepository<PetType,Long> {
}
