package com.endyary.patterns.behavioral.chainofresponsibility;

public class SocialEmailHandler extends EmailHandler {

    public SocialEmailHandler(EmailType emailType) {
        this.emailType = emailType;
    }

    @Override
    protected void receive(String emailContent) {
        System.out.println("SocialEmailHandler: " + emailContent);
    }
}
