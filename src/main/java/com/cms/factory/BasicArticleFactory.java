package com.cms.factory;

import com.cms.models.Article;
import java.time.LocalDateTime;
public class BasicArticleFactory implements ArticleFactory {
    @Override
    public Article createArticle(String title, String content) {
        Article article = new Article();
        article.setTitle(title);
        article.setContent(content);
        article.setCreatedAt(LocalDateTime.now());
        return article;
    }
}
