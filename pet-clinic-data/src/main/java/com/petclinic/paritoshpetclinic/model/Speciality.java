package com.petclinic.paritoshpetclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

//Created by ppradeep on 11/11/18, 3:14 PM
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "speciality")
public class Speciality extends  BaseEntity {

    private String description;

    }
