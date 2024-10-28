package com.cms.decorators;

import com.cms.models.Article;

import java.util.List;

public class CommentsDecorator extends ArticleDecorator {
    private List<String> comments;

    public CommentsDecorator(ArticleComponent decoratedArticle, List<String> comments) {
        super(decoratedArticle);
        this.comments = comments;
    }

    @Override
    public String getDetails() {
        String details = super.getDetails();
        details += "\nComments: " + String.join(", ", comments);
        return details;
    }
}
