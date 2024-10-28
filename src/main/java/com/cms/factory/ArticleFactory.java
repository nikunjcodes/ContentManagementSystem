package com.cms.factory;

import com.cms.models.Article;

public interface ArticleFactory {
    Article createArticle(String title, String content);
}
