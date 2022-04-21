package com.endyary.patterns.structural.composite;

public class BoxItem extends BoxComponent {

    public BoxItem(String name, String description) {
        super(name, description);
    }

    @Override
    public void print() {
        System.out.println("Box item: " + this.getName() + " - " + this.getDescription());
    }
}
