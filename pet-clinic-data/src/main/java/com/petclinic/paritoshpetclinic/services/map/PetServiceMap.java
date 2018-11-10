package com.petclinic.paritoshpetclinic.services.map;
//Created by ppradeep on 08/11/18, 10:48 PM

import com.petclinic.paritoshpetclinic.model.Pet;
import com.petclinic.paritoshpetclinic.services.CrudService;
import com.petclinic.paritoshpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapService<Pet , Long> implements PetService {


    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deletebyID(Long id) {
        super.deleteByID(id);
    }
}
