package com.petclinic.paritoshpetclinic.services;
//Created by ppradeep on 08/11/18, 4:42 PM

import com.petclinic.paritoshpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends  CrudService<Owner , Long>{

    Owner findByLastName(String lastName);
}
