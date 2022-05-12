package com.endyary.patterns.behavioral;

import com.endyary.patterns.behavioral.mediator.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    void lightMediatorTest() {
        Mediator mediator = new Mediator();

        Component power = new Power();
        Component lightSwitch = new LightSwitch();
        Component lightbulb = new Lightbulb();

        power.setController(mediator);
        lightSwitch.setController(mediator);
        lightbulb.setController(mediator);

        mediator.setPower(power);
        mediator.setLightSwitch(lightSwitch);
        mediator.setLightbulb(lightbulb);

        power.setOn(true);
        lightSwitch.setOn(true);
        Assertions.assertTrue(lightbulb.isOn());
        power.setOn(false);
        Assertions.assertFalse(lightbulb.isOn());
        lightSwitch.setOn(false);
        power.setOn(true);
        Assertions.assertFalse(lightbulb.isOn());
    }
}
