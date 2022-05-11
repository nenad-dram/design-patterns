package com.endyary.patterns.behavioral.chainofresponsibility;

public abstract class EmailHandler {
    protected EmailHandler nextHandler;
    protected EmailType emailType;

    public void setNextHandler(EmailHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(EmailType emailType, String emailContent) {
        if (this.emailType == emailType) {
            receive(emailContent);
        } else if (this.nextHandler != null) {
            this.nextHandler.handle(emailType, emailContent);
        }
    }

    protected abstract void receive(String emailContent);
}
