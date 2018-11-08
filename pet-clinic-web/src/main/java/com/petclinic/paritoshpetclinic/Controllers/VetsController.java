package com.petclinic.paritoshpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Created by ppradeep on 09/11/18, 12:16 AM
@Controller
public class VetsController {
@RequestMapping({"/vets/index.html","/vets/index","vets/index","vet","vets","/vet","/vets"})
public String index(){
    return "vets/index";
}
}
