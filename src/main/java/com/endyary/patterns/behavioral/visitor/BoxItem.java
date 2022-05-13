package com.endyary.patterns.behavioral.visitor;

public class BoxItem extends BoxComponent {

    public BoxItem(String name, String description) {
        super(name, description);
    }

    @Override
    public void print() {
        System.out.println("Box item: " + this.getName() + " - " + this.getDescription());
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitItem(this);
    }
}
