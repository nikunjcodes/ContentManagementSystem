package com.cms.decorators;

import java.util.List;

public class TagsDecorator extends ArticleDecorator {
    private List<String> tags;

    public TagsDecorator(ArticleComponent decoratedArticle, List<String> tags) {
        super(decoratedArticle);
        this.tags = tags;
    }

    @Override
    public String getDetails() {
        String details = super.getDetails();
        details += "\nTags: " + String.join(", ", tags);
        return details;
    }
}
