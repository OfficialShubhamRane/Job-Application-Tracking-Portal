package com.example.jobapplicationtrackingportal.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FillAppliDetailsController {

    @PostMapping("/fill-up-application-details")
    public String fillUpAppliDetails(){
        return "FillUpApplicationDetailsView.html";
    }
}
