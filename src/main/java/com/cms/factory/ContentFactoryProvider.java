package com.cms.factory;

public class ContentFactoryProvider {

    public static ArticleFactory getArticleFactory() {
        return new BasicArticleFactory();
    }

    public static AuthorFactory getAuthorFactory() {
        return new BasicAuthorFactory();
    }

    public static ThemeFactory getThemeFactory() {
        return new BasicThemeFactory();
    }
}
