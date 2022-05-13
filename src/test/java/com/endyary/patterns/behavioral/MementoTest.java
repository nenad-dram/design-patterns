package com.endyary.patterns.behavioral;

import com.endyary.patterns.behavioral.memento.TextCaretaker;
import com.endyary.patterns.behavioral.memento.TextOriginator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MementoTest {

    @Test
    void textEditorTest() {
        TextCaretaker textCaretaker = new TextCaretaker(new TextOriginator());
        textCaretaker.write("The first input");
        textCaretaker.write(", an additional content");
        textCaretaker.doSave();
        textCaretaker.write(", and something else");
        textCaretaker.doUndo();
        Assertions.assertTrue(textCaretaker.print().contains("The first input"));
    }
}
