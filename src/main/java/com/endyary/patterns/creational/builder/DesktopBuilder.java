package com.endyary.patterns.creational.builder;

public class DesktopBuilder implements ComputerBuilder {
    private String cpu;
    private String memory;
    private String storage;
    private String power;
    private String motherboard;
    private String monitor;
    private String keyboard;
    private String mouse;

    private DesktopBuilder() {
    }

    public static DesktopBuilder create() {
        return new DesktopBuilder();
    }

    @Override
    public void setCpu(String cpu) {
        this.cpu = "DT: " + cpu;
    }

    @Override
    public void setMemory(String memory) {
        this.memory = "DT: " + memory;
    }

    @Override
    public void setStorage(String storage) {
        this.storage = "DT: " + storage;
    }

    @Override
    public void setPower(String power) {
        this.power = "DT: " + power;
    }

    @Override
    public void setMotherboard(String motherboard) {
        this.motherboard = "DT: " + motherboard;
    }

    @Override
    public void setMonitor(String monitor) {
        this.monitor = "DT: " + monitor;
    }

    @Override
    public void setKeyboard(String keyboard) {
        this.keyboard = "DT: " + keyboard;
    }

    @Override
    public void setMouse(String mouse) {
        this.mouse = "DT: " + mouse;
    }

    public Computer getResult() {
        return new Computer(cpu, memory, storage, power, motherboard, monitor, keyboard, mouse);
    }
}
