package com.endyary.patterns.behavioral.state;

public class StatePublish implements ArticleState {
    Article article;

    public StatePublish(Article article) {
        this.article = article;
    }

    @Override
    public void setText(String text) {
        System.out.println("PUBLISH article can't be changed!");
    }

    @Override
    public void save() {
        System.out.println("SAVE from PUBLISH isn't allowed!");
    }

    @Override
    public void publish() {
        System.out.println("PUBLISH from PUBLISH isn't allowed!");
    }

    @Override
    public void remove() {
        article.setState(new StateRemove(article));
        System.out.println("Status changed to REMOVE");
    }
}
