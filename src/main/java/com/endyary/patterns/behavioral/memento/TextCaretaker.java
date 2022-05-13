package com.endyary.patterns.behavioral.memento;

public class TextCaretaker {
    private TextOriginator textOriginator;
    private TextMemento textMemento;

    public TextCaretaker(TextOriginator textOriginator) {
        this.textOriginator = textOriginator;
    }

    public void write(String text) {
        textOriginator.addText(text);
    }

    public String print() {
        return textOriginator.getCurrentText();
    }

    public void doSave() {
        textMemento = textOriginator.save();
    }

    public void doUndo() {
        textOriginator.restore(textMemento);
    }
}
