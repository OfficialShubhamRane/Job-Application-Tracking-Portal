package com.example.jobapplicationtrackingportal.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FillAppliDetailsController {

    @GetMapping("/fill-up-application-details")
    public String fillUpAppliDetails(){
        return "FillUpApplicationDetailsView.html";
    }
}
