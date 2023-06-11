package com.planittesting.cloud.jupiter.pom.objects;

public class DeliveryDetails  {

    private String forename;

    private String surname;
    private String email;
    private String telephone;
    private String address;

    public DeliveryDetails() {}

    public DeliveryDetails(
            String forename,
            String surname,
            String email,
            String telephone,
            String address
            ) {
        this.forename = forename;
        this.surname = surname;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
