package com.petclinic.paritoshpetclinic.services;
//Created by ppradeep on 08/11/18, 10:15 PM

import java.util.Set;

public interface CrudService<T,ID> {

    Set<T> findAll();

    T findByID(ID id);

    T save(T object);

    void delete(T object);

    void deletebyID(ID id);

}
