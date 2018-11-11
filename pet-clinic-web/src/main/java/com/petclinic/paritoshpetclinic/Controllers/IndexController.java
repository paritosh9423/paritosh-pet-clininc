package com.petclinic.paritoshpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Created by ppradeep on 08/11/18, 11:35 PM
@Controller
public class IndexController {
    @RequestMapping({"","/","index","index.html"})
    public String index(){
        return "index";
    }

    @RequestMapping({"/oups"})
    public  String returnNotImplementedPage(){
        return "notImplemented";
    }


}
