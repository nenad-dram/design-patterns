package com.endyary.patterns.behavioral.visitor;

public class HtmlVisitor implements Visitor {
    @Override
    public void visitBox(Box box) {
        System.out.println("<ul>");
        System.out.println("<!-- " + box.getName() + "-->");
    }

    @Override
    public void visitItem(BoxItem boxItem) {
        System.out.println("<li> " + boxItem.getName() + " </li>");
    }

    @Override
    public void visitBoxEnd(Box box) {
        System.out.println("<!-- " + box.getName() + "-->");
        System.out.println("</ul> ");
    }
}
