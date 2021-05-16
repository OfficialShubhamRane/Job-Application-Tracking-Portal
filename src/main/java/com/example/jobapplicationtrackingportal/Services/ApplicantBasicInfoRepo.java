package com.example.jobapplicationtrackingportal.Services;

import com.example.jobapplicationtrackingportal.Models.ApplicantBasicInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantBasicInfoRepo extends JpaRepository< ApplicantBasicInfo , Integer > {

}
