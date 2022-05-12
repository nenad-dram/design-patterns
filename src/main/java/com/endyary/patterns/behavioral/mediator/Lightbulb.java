package com.endyary.patterns.behavioral.mediator;

public class Lightbulb extends Component {


    @Override
    public void setOn(boolean on) {
        if (this.isOn != on) {
            System.out.println("Set Lightbulb on: " + on);
            this.isOn = on;
            this.mediator.notifyForChange();
        }
    }
}
