package com.endyary.patterns.behavioral.command;

import java.util.Map;

public class Mouse {
    private Map<String, ClickCommand> buttons;

    public Mouse(Map<String, ClickCommand> buttons) {
        this.buttons = buttons;
    }

    public void leftClick() {
        buttons.get("left").execute();
    }

    public void rightClick() {
        buttons.get("right").execute();
    }

    public void scroll() {
        buttons.get("scroll").execute();
    }
}
