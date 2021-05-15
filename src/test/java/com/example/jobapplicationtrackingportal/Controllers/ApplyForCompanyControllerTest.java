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

@ContextConfiguration(classes = {ApplyForCompanyController.class})
@ExtendWith(SpringExtension.class)
public class ApplyForCompanyControllerTest {
    @Autowired
    private ApplyForCompanyController applyForCompanyController;

    @Test
    public void testApplyForCompany() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/apply-for-company");
        MockMvcBuilders.standaloneSetup(this.applyForCompanyController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("ApplyForCompanyView.html"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("ApplyForCompanyView.html"));
    }

    @Test
    public void testApplyForCompany2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/apply-for-company", "Uri Vars");
        MockMvcBuilders.standaloneSetup(this.applyForCompanyController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("ApplyForCompanyView.html"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("ApplyForCompanyView.html"));
    }
}

