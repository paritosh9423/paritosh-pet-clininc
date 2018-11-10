package com.petclinic.paritoshpetclinic.bootstrap;
//Created by ppradeep on 10/11/18, 1:14 PM

import com.petclinic.paritoshpetclinic.model.Owner;
import com.petclinic.paritoshpetclinic.model.Vet;
import com.petclinic.paritoshpetclinic.services.OwnerService;
import com.petclinic.paritoshpetclinic.services.VetService;
import com.petclinic.paritoshpetclinic.services.map.OwnerServiceMap;
import com.petclinic.paritoshpetclinic.services.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private  final OwnerService ownerService;
    private final VetService vetService;

    @Autowired//Not required to write autowired in constructor injectin n spring 5 but is preferred to write for understanding purpose.
    public DataLoader(OwnerService ownerService, VetService vetService) {


        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Start Loading Owners");

        Owner o1 = new Owner();
        o1.setId(1L);
        o1.setFirstName("PARITOSH");
        o1.setLastName("PRADEEP");

        ownerService.save(o1);

        Owner o2 = new Owner();
        o2.setId(2L);
        o2.setFirstName("AKASH");
        o2.setLastName("VERMA");

        ownerService.save(o2);

        System.out.println("Owners Loaded");
        System.out.println("Start Loading Vets");

        Vet v1 = new Vet();
        v1.setId(1L);
        v1.setFirstName("DR BACHOOKA");
        v1.setLastName("RABDIWALA");
         vetService.save(v1);

        Vet v2 = new Vet();
        v1.setId(2L);
        v1.setFirstName("DR STRANGE");
        v1.setLastName("MOVIEWALA");
        vetService.save(v2) ;


        System.out.println("Vets Loaded");

    }
}