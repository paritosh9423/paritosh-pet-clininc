package com.petclinic.paritoshpetclinic.services.map;
//Created by ppradeep on 11/11/18, 4:24 PM

import com.petclinic.paritoshpetclinic.model.Speciality;
import com.petclinic.paritoshpetclinic.services.SpecialitiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default","map"})
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deletebyID(Long id) {
        super.deleteByID(id);
    }
}
