package com.petclinic.paritoshpetclinic.services.map;
//Created by ppradeep on 14/11/18, 8:37 PM

import com.petclinic.paritoshpetclinic.model.Visit;
import com.petclinic.paritoshpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VisitServiceMap extends AbstractMapService<Visit,Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findByID(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Visit save(Visit object) {

        if(object.getPet() == null || object.getPet().getOwner() ==null ||object.getPet().getId()==null
        ||object.getPet().getOwner().getId()==null)
                throw new RuntimeException("Invalid visit!");

        return super.save(object);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deletebyID(Long aLong) {
        super.deleteByID(aLong);
    }
}
