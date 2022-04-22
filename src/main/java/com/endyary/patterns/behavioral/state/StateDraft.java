package com.endyary.patterns.behavioral.state;

public class StateDraft implements ArticleState {
    Article article;

    public StateDraft(Article article) {
        this.article = article;
    }

    @Override
    public void setText(String text) {
        article.setContent(text);
    }

    @Override
    public void save() {
        article.setState(new StateSave(article));
        System.out.println("Status changed to SAVE");
    }

    @Override
    public void publish() {
        System.out.println("PUBLISH from DRAFT isn't allowed!");
    }

    @Override
    public void remove() {
        article.setContent("");
        article.setState(new StateNew(article));
        System.out.println("Status changed to NEW");
    }
}
