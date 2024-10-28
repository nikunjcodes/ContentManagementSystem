package com.cms.factory;

import com.cms.models.Author;

public interface AuthorFactory {
    Author createAuthor(String name, String email, String bio);
}
