package com.endyary.patterns.structural.composite;

public abstract class BoxComponent {

    private String name;
    private String description;

    protected BoxComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public abstract void print();

    public void add(BoxComponent component) {
        throw new UnsupportedOperationException();
    }

    public BoxComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public void remove(BoxComponent component) {
        throw new UnsupportedOperationException();
    }

}
