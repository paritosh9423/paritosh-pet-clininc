package com.petclinic.paritoshpetclinic.services.springDataJPA;


import com.petclinic.paritoshpetclinic.model.Owner;
import com.petclinic.paritoshpetclinic.repositories.OwnerRepository;
import com.petclinic.paritoshpetclinic.repositories.PetRepository;
import com.petclinic.paritoshpetclinic.repositories.PetTypeRespository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class OwnerSpringDataJPAServiceTest {
    public static final String LAST_NAME = "Pradeep";
    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRespository petTypeRespository;
    @InjectMocks
    OwnerSpringDataJPAService ownerSpringDataJPAService;

    Owner returnOwner;


    @BeforeEach
    void setUp() {
        returnOwner =  Owner.builder().id(1L).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {

        Mockito.when(ownerRepository.findByLastName(Mockito.any()))
                .thenReturn(returnOwner);
        Owner owner = ownerSpringDataJPAService.findByLastName(LAST_NAME);
        assertEquals(LAST_NAME,owner.getLastName());
    }

    @Test
    void findAll() {

        Set<Owner> returnOwnerSet = new HashSet<>();
        returnOwnerSet.add(Owner.builder().id(1L).build());
        returnOwnerSet.add(Owner.builder().id(2L).build());
        Mockito.when(ownerRepository.findAll())
                .thenReturn(returnOwnerSet);

        assertEquals(2,ownerSpringDataJPAService.findAll().size());
    }

    @Test
    void findByID() {

        Mockito.when(ownerRepository.findById(1L)).thenReturn(Optional.of(returnOwner));
        Owner owner = ownerSpringDataJPAService.findByID(1L);
        assertNotNull(owner);

    }

    @Test
    void findByIDNotFound() {

        Mockito.when(ownerRepository.findById(2L)).thenReturn(Optional.empty());
        Owner owner = ownerSpringDataJPAService.findByID(2L);
        assertNull(owner);

    }


    @Test
    void save() {

        Owner ownertoSave = Owner.builder().id(1L).build();
        Mockito.when(ownerRepository.save(Mockito.any())).thenReturn(returnOwner);
        Owner savedOwner = ownerSpringDataJPAService.save(ownertoSave);

        assertNotNull(savedOwner);
        Mockito.verify(ownerRepository).save(Mockito.any());
    }

    @Test
    void delete() {

        ownerSpringDataJPAService.delete(returnOwner);
        //Default is 1 times
        Mockito.verify(ownerRepository,Mockito.times(1)).delete(Mockito.any());

    }

    @Test
    void deletebyID() {

        ownerSpringDataJPAService.deletebyID(1L);
        Mockito.verify(ownerRepository , Mockito.times(1)).deleteById(Mockito.anyLong());

    }


}