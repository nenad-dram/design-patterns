package com.endyary.patterns.behavioral.command;

public class ClickReceiver {
    public void doLeftClick() {
        System.out.println("Left click done");
    }

    public void doRightClick() {
        System.out.println("Right click done");
    }

    public void doScroll() {
        System.out.println("Scrolling done");
    }
}
