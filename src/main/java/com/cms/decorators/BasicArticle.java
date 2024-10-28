package com.cms.decorators;

import com.cms.models.Article;

public class BasicArticle implements ArticleComponent {
    private Article article;

    public BasicArticle(Article article) {
        this.article = article;
    }

    @Override
    public Article getArticle() {
        return article;
    }

    @Override
    public String getDetails() {
        return "Title: " + article.getTitle() + "\n" +
                "Content: " + article.getContent() + "\n" +
                "Author: " + article.getAuthor().getName() + "\n" +
                "Theme: " + article.getTheme().getName();
    }
}
