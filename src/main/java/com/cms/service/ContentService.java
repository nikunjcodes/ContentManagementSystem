package com.cms.service;

import com.cms.factory.ContentFactoryProvider;
import com.cms.models.Article;
import com.cms.models.Author;
import com.cms.models.Theme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentService {

    public Article createArticle(String title, String content, String authorName, String authorEmail, String authorBio, String themeName, String themeDescription) {
        Author author = ContentFactoryProvider.getAuthorFactory().createAuthor(authorName, authorEmail, authorBio);
        Theme theme = ContentFactoryProvider.getThemeFactory().createTheme(themeName, themeDescription);
        Article article = ContentFactoryProvider.getArticleFactory().createArticle(title, content);
        article.setAuthor(author);
        article.setTheme(theme);

        return article;
    }
}
