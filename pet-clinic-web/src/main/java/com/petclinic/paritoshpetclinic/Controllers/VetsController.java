package com.petclinic.paritoshpetclinic.Controllers;

import com.petclinic.paritoshpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Created by ppradeep on 09/11/18, 12:16 AM
@Controller
public class VetsController {

    private final VetService vetService;
    @Autowired
    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets/index.html","/vets/index","vets/index","vet","vets","/vet","/vets"})
    public String index(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}
