package com.example.jobapplicationtrackingportal.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApplyForCompanyController {

    @PostMapping("/apply-for-company")
    public String applyForCompany(){
        return "ApplyForCompanyView.html";
    }
}
