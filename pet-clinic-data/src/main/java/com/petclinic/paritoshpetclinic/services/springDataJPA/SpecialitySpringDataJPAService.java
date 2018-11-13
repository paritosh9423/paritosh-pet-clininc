package com.petclinic.paritoshpetclinic.services.springDataJPA;
//Created by ppradeep on 13/11/18, 10:12 PM

import com.petclinic.paritoshpetclinic.model.Speciality;
import com.petclinic.paritoshpetclinic.repositories.SpecialityRepository;
import com.petclinic.paritoshpetclinic.services.SpecialitiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class SpecialitySpringDataJPAService implements SpecialitiesService {

    private final SpecialityRepository specialityRepository;

    public SpecialitySpringDataJPAService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialitySet = new HashSet<>();
        specialityRepository.findAll().forEach(specialitySet::add);
        return specialitySet;
    }

    @Override
    public Speciality findByID(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deletebyID(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
