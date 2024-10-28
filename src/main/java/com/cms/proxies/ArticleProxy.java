package com.cms.proxies;

import com.cms.models.Article;

public class ArticleProxy implements ArticleInterface {
    private RealArticle realArticle;
    private boolean isAuthenticated; // This could be a more complex authentication check

    public ArticleProxy(Article article, boolean isAuthenticated) {
        this.realArticle = new RealArticle(article);
        this.isAuthenticated = isAuthenticated;
    }

    @Override
    public Article getArticle() {
        return realArticle.getArticle();
    }

    @Override
    public String getDetails() {
        if (isAuthenticated) {
            return realArticle.getDetails();
        } else {
            return "Access Denied. You do not have permission to view this article.";
        }
    }
}
