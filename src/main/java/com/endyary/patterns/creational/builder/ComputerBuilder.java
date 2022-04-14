package com.endyary.patterns.creational.builder;

public interface ComputerBuilder {
    void setCpu(String cpu);

    void setMemory(String memory);

    void setStorage(String storage);

    void setPower(String power);

    void setMotherboard(String motherboard);

    void setMonitor(String monitor);

    void setKeyboard(String keyboard);

    void setMouse(String mouse);
}
