package com.cms.decorators;

import com.cms.models.Article;

public abstract class ArticleDecorator implements ArticleComponent {
    protected ArticleComponent decoratedArticle;

    public ArticleDecorator(ArticleComponent decoratedArticle) {
        this.decoratedArticle = decoratedArticle;
    }

    @Override
    public Article getArticle() {
        return decoratedArticle.getArticle();
    }

    @Override
    public String getDetails() {
        return decoratedArticle.getDetails();
    }
}
