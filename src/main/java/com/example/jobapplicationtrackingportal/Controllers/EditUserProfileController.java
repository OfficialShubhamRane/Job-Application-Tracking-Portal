package com.example.jobapplicationtrackingportal.Controllers;

import com.example.jobapplicationtrackingportal.Models.ApplicantBasicInfo;
import com.example.jobapplicationtrackingportal.Services.ApplicantBasicInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EditUserProfileController {

    @Autowired
    ApplicantBasicInfoRepo applicantBasicInfoRepo;

    @GetMapping("/edit-user-profile")
    public String editUserProfile(){
        return "EditUserProfileView.html";
    }

    @GetMapping("/update-profile")
    public String updateUserProfileInfo(ApplicantBasicInfo applicantBasicInfo){
        applicantBasicInfoRepo.save(applicantBasicInfo);
        return "EditUserProfileView.html";
    }

    @GetMapping("/update-profile/{fname}/{lname}")
    @ResponseBody
    public ApplicantBasicInfo updateUserProfileInfo(
            @PathVariable("fname")String fname,
            @PathVariable("lname")String lname
    ){
        ApplicantBasicInfo applicantBasicInfo = new ApplicantBasicInfo();
        applicantBasicInfo.setLname(fname);
        applicantBasicInfo.setLname(lname);
        return applicantBasicInfo;
    }

}
