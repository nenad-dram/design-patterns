package com.endyary.patterns.behavioral.state;

public class StateNew implements ArticleState {
    Article article;

    public StateNew(Article article) {
        this.article = article;
    }

    @Override
    public void setText(String text) {
        article.setContent(text);
        article.setState(new StateDraft(article));
        System.out.println("Status changed to DRAFT");
    }

    @Override
    public void save() {
        System.out.println("SAVE from NEW isn't allowed!");
    }

    @Override
    public void publish() {
        System.out.println("PUBLISH from NEW isn't allowed!");
    }

    @Override
    public void remove() {
        System.out.println("REMOVE from NEW isn't allowed!");
    }
}
