package com.endyary.patterns.creational;

import com.endyary.patterns.creational.prototype.Robot;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

public class PrototypeTest {
    @Test
    void robotPrototypeTest() {
        Robot prototypeRobot = Robot.create(1, "model", "type", "feature");
        Robot cloneRobot = (Robot) prototypeRobot.clone();

        SoftAssertions assertions = new SoftAssertions();
        assertions.assertThat(prototypeRobot).isNotEqualTo(cloneRobot);
        assertions.assertThat(prototypeRobot.getId()).isNotEqualTo(cloneRobot.getId());
        assertions.assertThat(prototypeRobot.getModel()).isEqualTo(cloneRobot.getModel());
        assertions.assertAll();
    }
}
