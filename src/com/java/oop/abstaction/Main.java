package com.java.oop.abstaction;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(25,"Surya Prathap","surya@gmail.com","3732927382","5717238327387");
        ApplicationForm form = new ApplicationForm(01,"Birth Certificate Application",customer);
        Mro mro = new Mro(97,"Raju",1000);
        Attender attender = new Attender(71,"Suresh",1000,mro);
        PrintService printService = new NormalPrintService();

        CertificateService certificateService = new CertificateServiceImpl(attender,printService);
        Certificate certificate = certificateService.getCertificate(form);
    }
}
