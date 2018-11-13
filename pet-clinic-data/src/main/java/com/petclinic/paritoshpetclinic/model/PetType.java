package com.petclinic.paritoshpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

//Created by ppradeep on 08/11/18, 2:20 PM
@Entity
@Table(name="types")
public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
