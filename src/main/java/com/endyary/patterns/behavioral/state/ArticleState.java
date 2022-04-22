package com.endyary.patterns.behavioral.state;

public interface ArticleState {
    
    void setText(String text);

    void save();

    void publish();

    void remove();
}
