package com.endyary.patterns.behavioral.command;

public class LeftClick implements ClickCommand {
    private final ClickReceiver receiver;

    public LeftClick(ClickReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doLeftClick();
    }
}
