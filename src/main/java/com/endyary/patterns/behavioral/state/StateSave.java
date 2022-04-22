package com.endyary.patterns.behavioral.state;

public class StateSave implements ArticleState {
    Article article;

    public StateSave(Article article) {
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
        System.out.println("SAVE from SAVE isn't allowed!");
    }

    @Override
    public void publish() {
        article.setState(new StatePublish(article));
        System.out.println("Status changed to PUBLISH");
    }

    @Override
    public void remove() {
        article.setContent("");
        article.setState(new StateNew(article));
        System.out.println("Status changed to NEW");
    }
}
