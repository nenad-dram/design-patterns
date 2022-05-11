package com.endyary.patterns.behavioral.chainofresponsibility;

public class PrimaryEmailHandler extends EmailHandler {

    public PrimaryEmailHandler(EmailType emailType) {
        this.emailType = emailType;
    }

    @Override
    protected void receive(String emailContent) {
        System.out.println("PrimaryEmailHandler: " + emailContent);
    }
}
