package com.petclinic.paritoshpetclinic.Controllers;

import com.petclinic.paritoshpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//Created by ppradeep on 09/11/18, 12:24 AM
@RequestMapping("/owners")
@Controller
public class OwnersController {

    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/","/index","/index.html" ,""})
    public String index(Model model){
   model.addAttribute("owners",ownerService.findAll());
    return "owners/index.html";
    }
}
