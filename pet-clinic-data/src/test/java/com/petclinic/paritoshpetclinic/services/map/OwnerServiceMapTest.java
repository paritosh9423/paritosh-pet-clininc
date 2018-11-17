package com.petclinic.paritoshpetclinic.services.map;

import com.petclinic.paritoshpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {
OwnerServiceMap ownerServiceMap;

private final Long id = 101L;
private final String lastName = "Pradeep";
    @BeforeEach
    void setUp() {

        ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(),new PetServiceMap());
        ownerServiceMap.save(Owner.builder().id(id).lastName(lastName).build());

    }

    @Test
    void findAll() {

        Set<Owner> ownerSet = ownerServiceMap.findAll();
        assertEquals(1,ownerSet.size());

    }

    @Test
    void findByID() {
        Owner owner = ownerServiceMap.findByID(id);
        assertEquals(id,owner.getId());

    }

    @Test
    void saveExistingId() {
        Long id = 102L;
    Owner ownerSaveTest  = ownerServiceMap.save(Owner.builder().id(102L).build());
    Owner ownerSaved = ownerServiceMap.save(ownerSaveTest);
    assertEquals(id,ownerSaved.getId());


    }
    @Test
    void saveNoId(){
        Owner ownerSaved = ownerServiceMap.save(Owner.builder().build());
        assertNotNull(ownerSaved);
        assertNotNull(ownerSaved.getId());
    }

    @Test
    void delete() {
        assertEquals(1,ownerServiceMap.findAll().size());//1 object from setup method present
        ownerServiceMap.delete(ownerServiceMap.findByID(id));
        assertEquals(0,ownerServiceMap.findAll().size());
    }

    @Test
    void deletebyID() {
        assertEquals(1,ownerServiceMap.findAll().size());
        ownerServiceMap.deletebyID(id);
        assertEquals(0,ownerServiceMap.findAll().size());

    }

    @Test
    void findByLastName() {
        Owner owner = ownerServiceMap.findByLastName(lastName);
        assertEquals(lastName,owner.getLastName());

    }

    @Test
    void findByLastNameNotFound() {
        Owner owner = ownerServiceMap.findByLastName("NotPresent");
        assertNull(owner);


    }
}