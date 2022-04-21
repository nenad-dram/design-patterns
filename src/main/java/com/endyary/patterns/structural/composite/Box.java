package com.endyary.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Box extends BoxComponent {
    private List<BoxComponent> components;

    public Box(String name, String description) {
        super(name, description);
        components = new ArrayList<>();
    }

    @Override
    public void add(BoxComponent component) {
        components.add(component);
    }

    @Override
    public void print() {
        System.out.println("Box: " + this.getName() + " - " + this.getDescription());
        for (BoxComponent component : components) {
            System.out.println(component.getName() + " - " + component.getDescription());
        }
    }

    @Override
    public BoxComponent getChild(int index) {
        if (index > components.size()) {
            throw new NoSuchElementException();
        }
        return components.get(index);
    }

    @Override
    public void remove(BoxComponent component) {
        components.remove(component);
    }

}
