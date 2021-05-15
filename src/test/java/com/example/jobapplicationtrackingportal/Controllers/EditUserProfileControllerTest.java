package com.example.jobapplicationtrackingportal.Controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {EditUserProfileController.class})
@ExtendWith(SpringExtension.class)
public class EditUserProfileControllerTest {
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
    public void testEditUserProfile2() throws Exception {
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
    public void testEditUserProfile3() throws Exception {
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
    public void testEditUserProfile4() throws Exception {
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
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/update-profile");
        getResult.contentType("Not all who wander are lost");
        MockMvcBuilders.standaloneSetup(this.editUserProfileController)
                .build()
                .perform(getResult)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("EditUserProfileView.html"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("EditUserProfileView.html"));
    }
}

