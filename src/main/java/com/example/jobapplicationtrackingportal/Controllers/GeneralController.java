package com.example.jobapplicationtrackingportal.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneralController {

    @GetMapping("/Dashboard")
    public String getDashboard(){
        System.out.println("In the Dashboard");
        return "DashboardView.html";
    }
}
