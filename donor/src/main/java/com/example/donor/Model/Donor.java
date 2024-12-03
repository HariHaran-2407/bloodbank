package com.example.donor.Model;

import jakarta.persistence.*;

@Entity
@Table(name="donor")
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long donorId;

    @Column(name="name")
    private String donorName;

    @Column(name="contact")
    private String donorContact;

    @Column(name="bloodtype")
    private String bloodType;

    @Column(name="age")
    private int donorAge;

    public Long getDonorId() {
        return donorId;
    }

    public void setDonorId(Long donorId) {
        this.donorId = donorId;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorContact() {
        return donorContact;
    }

    public void setDonorContact(String donorContact) {
        this.donorContact = donorContact;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getDonorAge() {
        return donorAge;
    }

    public void setDonorAge(int donorAge) {
        this.donorAge = donorAge;
    }

}
