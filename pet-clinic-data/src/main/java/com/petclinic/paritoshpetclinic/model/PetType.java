package com.petclinic.paritoshpetclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

//Created by ppradeep on 08/11/18, 2:20 PM
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="types")
public class PetType extends BaseEntity{

    private String name;


}
