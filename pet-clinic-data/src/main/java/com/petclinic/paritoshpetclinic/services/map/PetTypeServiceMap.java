package com.petclinic.paritoshpetclinic.services.map;
//Created by ppradeep on 11/11/18, 3:34 PM

import com.petclinic.paritoshpetclinic.model.PetType;
import com.petclinic.paritoshpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


import java.util.Set;
@Service
@Profile({"default","map"})
public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService {


    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deletebyID(Long id) {
        super.deleteByID(id);
    }
}
