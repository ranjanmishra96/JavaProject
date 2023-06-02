package com.designpatters.creational.builder;

import com.designpatters.creational.singleton.UserDTO;

import java.time.LocalDate;

// Abstract Builder
public interface UserDTOBuilder {

    // methods to build "parts"  of the product at a time

    UserDTOBuilder withFirstName(String fname);

    UserDTOBuilder withLastName(String lname);

    UserDTOBuilder withBirthday(LocalDate date);

    UserDTOBuilder withAddress(Address address);

    // method to "assemble" final product
    UserDTO build();


    // (optional) method to fetch already built object
    UserDTO getUserDTO();
}
