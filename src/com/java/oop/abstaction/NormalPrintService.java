package com.java.oop.abstaction;

public class NormalPrintService extends PrintService{
    @Override
    public void printCertificate(Certificate certificate) {
        System.out.println("Printing Certificate in Black And White........");
        System.out.println("Certificate Id: " + certificate.id);
        System.out.println("Certificate Name: " + certificate.name);
        System.out.println("Certificate Issued By: " + certificate.issuedBy);
        System.out.println("Certificate Issued To: " + certificate.issuedTo);
        System.out.println("Certificate Issued Date: " + certificate.issuedDate);
    }
}
