package com.petclinic.paritoshpetclinic.bootstrap;
//Created by ppradeep on 10/11/18, 1:14 PM

import com.petclinic.paritoshpetclinic.model.*;
import com.petclinic.paritoshpetclinic.services.OwnerService;
import com.petclinic.paritoshpetclinic.services.PetTypeService;
import com.petclinic.paritoshpetclinic.services.SpecialitiesService;
import com.petclinic.paritoshpetclinic.services.VetService;
import com.petclinic.paritoshpetclinic.services.map.OwnerServiceMap;
import com.petclinic.paritoshpetclinic.services.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private  final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialitiesService specialitiesService;

    @Autowired//Not required to write autowired in constructor injectin n spring 5 but is preferred to write for understanding purpose.
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialitiesService specialitiesService) {


        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialitiesService = specialitiesService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if(count == 0)
            loadData();

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(dog);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");


        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");

        Speciality savedRadiology = specialitiesService.save(radiology);
        Speciality savedSurgery = specialitiesService.save(surgery);
        Speciality savedDentistry = specialitiesService.save(dentistry);

        System.out.println("Start Loading Owners");

        Owner o1 = new Owner();
        //  o1.setId(1L);
        o1.setFirstName("PARITOSH");
        o1.setLastName("PRADEEP");
        o1.setAddress("1234,Electronic City");
        o1.setCity("Bangalore");
        o1.setTelephone("1234567890");

        Pet pet_1 = new Pet();
        pet_1.setPetType(savedDogPetType);
        pet_1.setOwner(o1);
        pet_1.setBirthDate(LocalDate.now());
        pet_1.setPetName("Jackie");

        o1.getPetsSet().add(pet_1);

        ownerService.save(o1);

        Owner o2 = new Owner();
        // o2.setId(2L);
        //Changing to o1.set* to clear a confusion on save
        o1.setFirstName("AKASH");
        o1.setLastName("VERMA");

        o1.setAddress("1234,Electronic City");
        o1.setCity("Bangalore");
        o1.setTelephone("1234567890");

        Pet pet_2 = new Pet();
        pet_2.setPetType(savedCatPetType);
        pet_2.setOwner(o2);
        pet_2.setBirthDate(LocalDate.now());
        pet_2.setPetName("SmellyCat");

        o1.getPetsSet().add(pet_2);

        ownerService.save(o2);

        System.out.println("Owners Loaded");
        System.out.println("Start Loading Vets");

        Vet v1 = new Vet();
        //v1.setId(1L);
        v1.setFirstName("DR BACHOOKA");
        v1.setLastName("RABDIWALA");
        v1.getSpecialities().add(savedRadiology);
        vetService.save(v1);

        Vet v2 = new Vet();
        //v2.setId(2L);
        v2.setFirstName("DR STRANGE");
        v2.setLastName("MOVIEWALA");
        v2.getSpecialities().add(savedSurgery);
        vetService.save(v2) ;


        System.out.println("Vets Loaded");
    }
}
