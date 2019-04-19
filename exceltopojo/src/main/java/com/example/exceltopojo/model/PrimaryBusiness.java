package com.example.exceltopojo.model;


public class PrimaryBusiness extends CDMEntity {

    private String legalName;
    private String businessName;
    private PhysicalAddress address;
    private String phone;
    private String alternateContactPhone;
    private String email;
    private String website;

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public PhysicalAddress getAddress() {
        return address;
    }

    public void setAddress(PhysicalAddress address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAlternateContactPhone() {
        return alternateContactPhone;
    }

    public void setAlternateContactPhone(String alternateContactPhone) {
        this.alternateContactPhone = alternateContactPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}