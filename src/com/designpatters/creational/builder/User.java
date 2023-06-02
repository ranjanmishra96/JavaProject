package com.designpatters.creational.builder;

import java.time.LocalDate;

public class User {

    private String firstname;
    private String lname;
    private LocalDate birthday;
    private Address address;

    public String getFname() {
        return firstname;
    }

    public void setFname(String fname) {
        this.firstname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lname='" + lname + '\'' +
                ", birthday=" + birthday +
                ", address=" + address +
                '}';
    }
}
