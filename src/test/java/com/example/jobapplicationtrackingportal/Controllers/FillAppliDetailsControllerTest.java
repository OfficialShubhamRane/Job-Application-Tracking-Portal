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

@ContextConfiguration(classes = {FillAppliDetailsController.class})
@ExtendWith(SpringExtension.class)
public class FillAppliDetailsControllerTest {
    @Autowired
    private FillAppliDetailsController fillAppliDetailsController;

    @Test
    public void testFillUpAppliDetails() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/fill-up-application-details");
        MockMvcBuilders.standaloneSetup(this.fillAppliDetailsController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("fillUpApplicationDetailsView.html"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("fillUpApplicationDetailsView.html"));
    }

    @Test
    public void testFillUpAppliDetails2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/fill-up-application-details",
                "Uri Vars");
        MockMvcBuilders.standaloneSetup(this.fillAppliDetailsController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("fillUpApplicationDetailsView.html"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("fillUpApplicationDetailsView.html"));
    }
}

