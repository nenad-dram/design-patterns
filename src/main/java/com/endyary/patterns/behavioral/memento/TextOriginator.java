package com.endyary.patterns.behavioral.memento;

public class TextOriginator {
    private StringBuilder currentText;

    public TextOriginator() {
        this.currentText = new StringBuilder();
    }

    public String getCurrentText() {
        return currentText.toString();
    }

    public void addText(String text) {
        currentText.append(text);
    }

    public TextMemento save() {
        return new TextMemento(currentText.toString());
    }

    public void restore(TextMemento memento) {
        currentText = new StringBuilder(memento.getText());
    }
}
