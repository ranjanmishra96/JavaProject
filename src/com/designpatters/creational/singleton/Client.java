package com.designpatters.creational.singleton;

import com.designpatters.creational.builder.Address;
import com.designpatters.creational.builder.User;
import com.designpatters.creational.builder.UserWebDTOBuilder;
import com.designpatters.creational.builder.UserDTOBuilder;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        EagerRegistry  registry = EagerRegistry.getInstance();
        EagerRegistry registry1 = EagerRegistry.getInstance();

        System.out.println(registry.equals(registry1));

        LazyRegistryWithDCL lazySingleton1 = LazyRegistryWithDCL.getINSTANCE();
        LazyRegistryWithDCL lazySingleton2 = LazyRegistryWithDCL.getINSTANCE();

        System.out.println(lazySingleton1.equals(lazySingleton2));

        LazyRegistryIODH singelton;

        singelton = LazyRegistryIODH.getInstance();
        singelton = LazyRegistryIODH.getInstance();
        singelton = LazyRegistryIODH.getInstance();
        singelton = LazyRegistryIODH.getInstance();singelton = LazyRegistryIODH.getInstance();



        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);

    }

    private static UserDTO directBuild(UserDTOBuilder builder, User user){

        return
                builder.withFirstName(user.getFname()).withLastName(user.getLname())
                        .withAddress(user.getAddress()).withBirthday(user.getBirthday()).build();

    }

    public static User createUser(){
        User user = new User();
        user.setBirthday(LocalDate.of(1960,5,6));
        user.setFname("Ranjan");
        user.setLname("Mishra");
        Address address = new Address();
        address.setCity("Patna");
        address.setHouseNumber("B /201");
        address.setStreet("Rukunpura");
        address.setState("Bihar");
        address.setZipCode("800014");
        user.setAddress(address);
        return user;
    }
}
