package com.cms.factory;

import com.cms.models.Author;

public class BasicAuthorFactory implements AuthorFactory {
    @Override
    public Author createAuthor(String name, String email, String bio) {
        Author author = new Author();
        author.setName(name);
        author.setEmail(email);
        author.setBio(bio);
        return author;
    }
}
