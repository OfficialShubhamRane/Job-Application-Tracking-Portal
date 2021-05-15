package com.example.jobapplicationtrackingportal.Models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ApplicantBasicInfoTest {
    @Test
    public void testConstructor() {
        ApplicantBasicInfo actualApplicantBasicInfo = new ApplicantBasicInfo();
        actualApplicantBasicInfo.setFname("Fname");
        actualApplicantBasicInfo.setLname("Lname");
        assertEquals("Fname", actualApplicantBasicInfo.getFname());
        assertEquals("Lname", actualApplicantBasicInfo.getLname());
        assertEquals("ApplicantBasicInfo{fname='Fname', lname='Lname'}", actualApplicantBasicInfo.toString());
    }
}

