package com.endyary.patterns.behavioral.visitor;

public interface Visitor {
    void visitBox(Box box);

    void visitItem(BoxItem boxItem);

    void visitBoxEnd(Box box);
}
