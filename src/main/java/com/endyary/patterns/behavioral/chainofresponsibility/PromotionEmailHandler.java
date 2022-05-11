package com.endyary.patterns.behavioral.chainofresponsibility;

public class PromotionEmailHandler extends EmailHandler {

    public PromotionEmailHandler(EmailType emailType) {
        this.emailType = emailType;
    }

    @Override
    protected void receive(String emailContent) {
        System.out.println("PromotionEmailHandler: " + emailContent);
    }
}
