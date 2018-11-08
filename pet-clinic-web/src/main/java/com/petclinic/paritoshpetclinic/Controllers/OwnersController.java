package com.petclinic.paritoshpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Created by ppradeep on 09/11/18, 12:24 AM
@RequestMapping("/owners")
@Controller
public class OwnersController {
@RequestMapping({"/","/index","/index.html" ,""})
public String index(){
    return "owners/index.html";
}
}
