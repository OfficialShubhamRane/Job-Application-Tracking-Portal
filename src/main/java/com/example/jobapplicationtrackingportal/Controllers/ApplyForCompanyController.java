package com.example.jobapplicationtrackingportal.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplyForCompanyController {

    @GetMapping("/apply-for-company")
    public String applyForCompany(){
        System.out.println("Applying for company");
        return "ApplyForCompanyView.html";
    }
}
