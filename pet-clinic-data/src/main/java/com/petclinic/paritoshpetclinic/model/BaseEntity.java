package com.petclinic.paritoshpetclinic.model;
//Created by ppradeep on 08/11/18, 4:56 PM

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
