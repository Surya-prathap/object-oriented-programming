package com.java.oop;

public class Customer {
    int id;
    String name;
    String gender;
    String emailAddress;
    String address;
    byte age;
    long mobileNumber;

    public Customer() {
        id = 123;
        name = "Prathap";
        gender = "Male";
        emailAddress = "prathap@gmail.com";
        address = "madhapur";
        age = 24;
        mobileNumber = 8273635479L;
    }

    public Customer(int id, String name, String gender, String emailAddress, String address, byte age, long mobileNumber) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.address = address;
        this.age = age;
        this.mobileNumber = mobileNumber;
    }
}
