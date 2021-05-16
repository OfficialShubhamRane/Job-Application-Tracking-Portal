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

@ContextConfiguration(classes = {DashboardController.class})
@ExtendWith(SpringExtension.class)
public class DashboardControllerTest {
    @Autowired
    private DashboardController dashboardController;

    @Test
    public void testGetDashboard() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/Dashboard");
        MockMvcBuilders.standaloneSetup(this.dashboardController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("DashboardView.html"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("DashboardView.html"));
    }

    @Test
    public void testGetDashboard2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/Dashboard", "Uri Vars");
        MockMvcBuilders.standaloneSetup(this.dashboardController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("DashboardView.html"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("DashboardView.html"));
    }
}

