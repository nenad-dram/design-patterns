package com.endyary.patterns.behavioral;

import com.endyary.patterns.behavioral.state.Article;
import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    void articleStateTest() {
        Article article = new Article();
        article.setText("Article content");
        article.save();
        article.publish();
        article.save();
        article.remove();
    }
}
