package com.java.oop.abstaction;

public class ApplicationForm {
    int id;
    String name;
    Customer customer;

    public ApplicationForm(int id, String name,Customer customer) {
        this.id = id;
        this.name = name;
        this.customer = customer;
    }
}
