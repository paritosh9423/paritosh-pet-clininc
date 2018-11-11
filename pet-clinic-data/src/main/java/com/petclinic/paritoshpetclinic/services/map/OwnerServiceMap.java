package com.petclinic.paritoshpetclinic.services.map;
//Created by ppradeep on 08/11/18, 10:40 PM

import com.petclinic.paritoshpetclinic.model.Owner;
import com.petclinic.paritoshpetclinic.model.Pet;
import com.petclinic.paritoshpetclinic.services.OwnerService;
import com.petclinic.paritoshpetclinic.services.PetService;
import com.petclinic.paritoshpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if(object!=null){
            if(object.getPetsSet()!=null){
                object.getPetsSet().forEach(pet->{
                    if(pet.getPetType()!=null){
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }

                    }else{
                        throw new RuntimeException("Pet Type is Required!");
                    }
                    if(pet.getId() == null){
                        Pet savedPet =  petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        }else{
            return null;
        }



    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deletebyID(Long id) {
        super.deleteByID(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
