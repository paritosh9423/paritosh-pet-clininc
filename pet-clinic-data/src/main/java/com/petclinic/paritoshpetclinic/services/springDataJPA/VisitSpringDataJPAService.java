package com.petclinic.paritoshpetclinic.services.springDataJPA;
//Created by ppradeep on 14/11/18, 8:49 PM


import com.petclinic.paritoshpetclinic.model.Visit;
import com.petclinic.paritoshpetclinic.repositories.VisitRepository;
import com.petclinic.paritoshpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSpringDataJPAService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSpringDataJPAService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visitSet = new HashSet<>();
        visitRepository.findAll().forEach(visitSet::add);
        return visitSet;
    }

    @Override
    public Visit findByID(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);

    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deletebyID(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
