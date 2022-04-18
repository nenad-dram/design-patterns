package com.endyary.patterns.behavioral;

import com.endyary.patterns.behavioral.command.ClickCommand;
import com.endyary.patterns.behavioral.command.ClickReceiver;
import com.endyary.patterns.behavioral.command.LeftClick;
import com.endyary.patterns.behavioral.command.Mouse;
import com.endyary.patterns.behavioral.command.RightClick;
import com.endyary.patterns.behavioral.command.Scroll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class CommandTest {

    @Test
    void mouseTest() {
        ClickReceiver receiver = new ClickReceiver();
        ClickCommand leftClick = new LeftClick(receiver);
        ClickCommand rightClick = new RightClick(receiver);
        ClickCommand scroll = new Scroll(receiver);

        Map<String, ClickCommand> clicks = new HashMap<>();
        clicks.put("left", leftClick);
        clicks.put("right", rightClick);
        clicks.put("scroll", scroll);

        Mouse mouse = new Mouse(clicks);

        mouse.leftClick();
        mouse.rightClick();
        mouse.scroll();
    }
}
