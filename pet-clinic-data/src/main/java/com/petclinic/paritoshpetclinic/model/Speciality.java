package com.petclinic.paritoshpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

//Created by ppradeep on 11/11/18, 3:14 PM
@Entity
@Table(name = "speciality")
public class Speciality extends  BaseEntity {
    
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
