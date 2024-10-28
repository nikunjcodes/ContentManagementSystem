package com.cms.decorators;

import com.cms.models.Article;

public interface ArticleComponent {
    Article getArticle();
    String getDetails();
}
