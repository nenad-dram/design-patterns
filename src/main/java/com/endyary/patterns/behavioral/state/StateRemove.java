package com.endyary.patterns.behavioral.state;

public class StateRemove implements ArticleState {
    Article article;

    public StateRemove(Article article) {
        this.article = article;
    }

    @Override
    public void setText(String text) {
        System.out.println("REMOVE article can't be changed!");
    }

    @Override
    public void save() {
        System.out.println("SAVE from REMOVE isn't allowed!");
    }

    @Override
    public void publish() {
        System.out.println("PUBLISH from REMOVE isn't allowed!");
    }

    @Override
    public void remove() {
        System.out.println("REMOVE from REMOVE isn't allowed!");
    }
}
