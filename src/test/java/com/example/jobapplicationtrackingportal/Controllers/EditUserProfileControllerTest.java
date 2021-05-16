package com.example.jobapplicationtrackingportal.Controllers;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.example.jobapplicationtrackingportal.Models.ApplicantBasicInfo;
import com.example.jobapplicationtrackingportal.Services.ApplicantBasicInfoRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {EditUserProfileController.class})
@ExtendWith(SpringExtension.class)
public class EditUserProfileControllerTest {
    @MockBean
    private ApplicantBasicInfoRepo applicantBasicInfoRepo;

    @Autowired
    private EditUserProfileController editUserProfileController;

    @Test
    public void testEditUserProfile() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/edit-user-profile");
        MockMvcBuilders.standaloneSetup(this.editUserProfileController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("EditUserProfileView.html"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("EditUserProfileView.html"));
    }

    @Test
    public void testEditUserProfile3() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/edit-user-profile", "Uri Vars");
        MockMvcBuilders.standaloneSetup(this.editUserProfileController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("EditUserProfileView.html"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("EditUserProfileView.html"));
    }

    @Test
    public void testUpdateUserProfileInfo() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/update-profile");
        MockMvcBuilders.standaloneSetup(this.editUserProfileController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("EditUserProfileView.html"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("EditUserProfileView.html"));
    }

    @Test
    public void testUpdateUserProfileInfo2() throws Exception {
        ApplicantBasicInfo applicantBasicInfo = new ApplicantBasicInfo();
        applicantBasicInfo.setFname("Fname");
        applicantBasicInfo.setLname("Lname");
        when(this.applicantBasicInfoRepo.save((ApplicantBasicInfo) any())).thenReturn(applicantBasicInfo);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/update-profile");
        MockMvcBuilders.standaloneSetup(this.editUserProfileController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("applicantBasicInfo"))
                .andExpect(MockMvcResultMatchers.view().name("EditUserProfileView.html"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("EditUserProfileView.html"));
    }

}

