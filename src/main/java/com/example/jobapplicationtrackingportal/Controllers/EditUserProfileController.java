package com.example.jobapplicationtrackingportal.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EditUserProfileController {

    @GetMapping("/edit-user-profile")
    public String editUserProfile(){
        System.out.println("Editing User Profile");
        return "EditUserProfileView.html";
    }

    @GetMapping("/update-profile")
    public String updateUserProfileInfo(){
        System.out.println("Updated new Info");
        return "EditUserProfileView.html";
    }

}
