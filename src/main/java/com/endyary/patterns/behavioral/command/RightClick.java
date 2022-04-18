package com.endyary.patterns.behavioral.command;

public class RightClick implements ClickCommand {

    private final ClickReceiver receiver;

    public RightClick(ClickReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doRightClick();
    }
}
