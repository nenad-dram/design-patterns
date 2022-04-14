package com.endyary.patterns.creational.builder;

public class LaptopBuilder implements ComputerBuilder {

    private String cpu;
    private String memory;
    private String storage;
    private String power;
    private String motherboard;
    private String monitor;
    private String keyboard;
    private String mouse;

    private LaptopBuilder() {
    }

    public static LaptopBuilder create() {
        return new LaptopBuilder();
    }

    @Override
    public void setCpu(String cpu) {
        this.cpu = "LT: " + cpu;
    }

    @Override
    public void setMemory(String memory) {
        this.memory = "LT: " + memory;
    }

    @Override
    public void setStorage(String storage) {
        this.storage = "LT: " + storage;
    }

    @Override
    public void setPower(String power) {
        this.power = "LT: " + power;
    }

    @Override
    public void setMotherboard(String motherboard) {
        this.motherboard = "LT: " + motherboard;
    }

    @Override
    public void setMonitor(String monitor) {
        this.monitor = "LT: " + monitor;
    }

    @Override
    public void setKeyboard(String keyboard) {
        this.keyboard = "LT: " + keyboard;
    }

    @Override
    public void setMouse(String mouse) {
        this.mouse = "LT: " + mouse;
    }

    public Computer getResult() {
        return new Computer(cpu, memory, storage, power, motherboard, monitor, keyboard, mouse);
    }
}
