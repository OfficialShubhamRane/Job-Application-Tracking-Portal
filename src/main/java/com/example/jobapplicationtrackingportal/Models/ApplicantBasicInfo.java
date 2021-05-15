package com.example.jobapplicationtrackingportal.Models;

public class ApplicantBasicInfo {

    private String fname;
    private String lname;

    public String getFname(){
        return fname;
    }

    public String getLname(){
        return lname;
    }

    public void setFname(String fname){
        this.fname = fname;
    }

    public void setLname(String lname){
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "ApplicantBasicInfo{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
