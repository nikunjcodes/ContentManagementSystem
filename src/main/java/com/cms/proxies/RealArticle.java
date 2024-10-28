package com.cms.proxies;

import com.cms.models.Article;

public class RealArticle implements ArticleInterface {
    private Article article;

    public RealArticle(Article article) {
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
