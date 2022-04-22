package com.endyary.patterns.behavioral.state;

public class Article {
    private String content;
    private ArticleState state;

    public Article() {

        content = "";
        setState(new StateNew(this));
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setText(String text) {
        state.setText(text);
    }

    public void save() {
        state.save();
    }

    public void publish() {
        state.publish();
    }

    public void remove() {
        state.remove();
    }

    public void setState(ArticleState state) {
        this.state = state;
    }

    public ArticleState getState() {
        return state;
    }
}
