package com.java.oop.abstaction;

public class Mro {
    int id;
    String name;
    int money;

    public Mro(int id, String name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    Certificate generateCertificate(ApplicationForm form){
        Certificate certificate = null;
        if (money > 500){
            certificate = new Certificate(101,"Birth Certificate","Rajesh",form.customer.name,"12/03/2026");
            System.out.println("Certificate Generated.....");
        }
        return certificate;
    }
}
