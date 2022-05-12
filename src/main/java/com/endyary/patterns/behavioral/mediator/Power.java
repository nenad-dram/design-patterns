package com.endyary.patterns.behavioral.mediator;

public class Power extends Component {
    @Override
    public void setOn(boolean on) {
        if (this.isOn != on) {
            System.out.println("Set Power on: " + on);
            this.isOn = on;
            this.mediator.notifyForChange();
        }
    }

}
