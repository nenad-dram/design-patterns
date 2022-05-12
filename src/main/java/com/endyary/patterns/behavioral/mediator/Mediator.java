package com.endyary.patterns.behavioral.mediator;

public class Mediator {

    private Component lightbulb;
    private Component lightSwitch;
    private Component power;

    public void setLightbulb(Component lightbulb) {
        this.lightbulb = lightbulb;
    }

    public void setLightSwitch(Component lightSwitch) {
        this.lightSwitch = lightSwitch;
    }

    public void setPower(Component power) {
        this.power = power;
    }

    public void notifyForChange() {
        lightbulb.setOn(this.power.isOn && this.lightSwitch.isOn);
    }

}
