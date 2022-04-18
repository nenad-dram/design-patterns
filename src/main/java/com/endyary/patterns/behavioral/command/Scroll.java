package com.endyary.patterns.behavioral.command;

public class Scroll implements ClickCommand {
    private final ClickReceiver receiver;

    public Scroll(ClickReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doScroll();
    }
}
