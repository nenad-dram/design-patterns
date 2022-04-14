package com.endyary.patterns.creational.builder;

public class Director {

    public ComputerBuilder builder;

    private Director(ComputerBuilder builder) {
        this.builder = builder;
    }

    public static Director create(ComputerBuilder builder) {
        return new Director(builder);
    }

    public void constructBasic() {
        builder.setCpu("BASIC CPU");
        builder.setMemory("BASIC MEMORY");
        builder.setStorage("BASIC STORAGE");
        builder.setPower("BASIC POWER");
        builder.setMotherboard("BASIC MOTHERBOARD");
        builder.setMonitor("BASIC MONITOR");
        builder.setMouse("BASIC MOUSE");
        builder.setKeyboard("BASIC KEYBOARD");
    }

    public void constructAdvanced() {
        builder.setCpu("ADVANCED CPU");
        builder.setMemory("ADVANCED MEMORY");
        builder.setStorage("ADVANCED STORAGE");
        builder.setPower("ADVANCED POWER");
        builder.setMotherboard("ADVANCED MOTHERBOARD");
        builder.setMonitor("ADVANCED MONITOR");
        builder.setMouse("ADVANCED MOUSE");
        builder.setKeyboard("ADVANCED KEYBOARD");
    }
}
