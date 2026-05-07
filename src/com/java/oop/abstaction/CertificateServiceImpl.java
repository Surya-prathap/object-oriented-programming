package com.java.oop.abstaction;

public class CertificateServiceImpl extends CertificateService{

    Attender attender;
    PrintService printService;

    public CertificateServiceImpl(Attender attender,PrintService printService) {
        this.attender = attender;
        this.printService = printService;
    }

    public Certificate getCertificate(ApplicationForm form){
        Certificate generatedCertificate = attender.processCertificate(form);
        printService.printCertificate(generatedCertificate);
        return generatedCertificate;
    }
}
