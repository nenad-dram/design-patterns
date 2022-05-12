package com.endyary.patterns.behavioral.mediator;

public class LightSwitch extends Component {
    @Override
    public void setOn(boolean on) {
        if (this.isOn != on) {
            System.out.println("Set Switch on: " + on);
            this.isOn = on;
            this.mediator.notifyForChange();
        }
    }

}
