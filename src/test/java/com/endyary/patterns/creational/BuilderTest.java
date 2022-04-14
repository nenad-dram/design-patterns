package com.endyary.patterns.creational;

import com.endyary.patterns.creational.builder.Computer;
import com.endyary.patterns.creational.builder.DesktopBuilder;
import com.endyary.patterns.creational.builder.Director;
import com.endyary.patterns.creational.builder.LaptopBuilder;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

public class BuilderTest {
    @Test
    void computerBuilderTest() {
        LaptopBuilder laptopBuilder = LaptopBuilder.create();
        DesktopBuilder desktopBuilder = DesktopBuilder.create();

        Director directorLaptop = Director.create(laptopBuilder);
        Director directorDesktop = Director.create(desktopBuilder);
        directorLaptop.constructAdvanced();
        directorDesktop.constructAdvanced();

        Computer laptop = laptopBuilder.getResult();
        Computer desktop = desktopBuilder.getResult();

        SoftAssertions assertions = new SoftAssertions();
        assertions.assertThat(laptop.getCpu()).isNotEqualTo(desktop.getCpu());
        assertions.assertThat(laptop.getMemory()).isNotEqualTo(desktop.getMemory());
        assertions.assertAll();
    }
}
