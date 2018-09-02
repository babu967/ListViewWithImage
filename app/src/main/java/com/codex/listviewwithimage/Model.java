package com.codex.listviewwithimage;

public class Model {
    private String doctorName;
    private String doctorDetails;
    private String doctorDate;
    private  int image;

    public Model(String doctorName, String doctorDetails, String doctorDate, int image) {
        this.doctorName = doctorName;
        this.doctorDetails = doctorDetails;
        this.doctorDate = doctorDate;
        this.image = image;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorDetails() {
        return doctorDetails;
    }

    public void setDoctorDetails(String doctorDetails) {
        this.doctorDetails = doctorDetails;
    }

    public String getDoctorDate() {
        return doctorDate;
    }

    public void setDoctorDate(String doctorDate) {
        this.doctorDate = doctorDate;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
