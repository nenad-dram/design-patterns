package com.endyary.patterns.behavioral.mediator;

public abstract class Component {

    protected Mediator mediator;

    protected boolean isOn = false;

    public void setController(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }

    public abstract void setOn(boolean on);
}
