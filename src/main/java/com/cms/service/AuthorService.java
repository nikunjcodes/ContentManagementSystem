package com.cms.service;

import com.cms.models.Author;
import com.cms.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    public Optional<Author> findById(Long id) {
        return authorRepository.findById(id);
    }

    public Author save(Author author) {
        return authorRepository.save(author);
    }

    public Optional<Author> update(Long id, Author author) {
        if (authorRepository.existsById(id)) {
            author.setId(id);
            return Optional.of(authorRepository.save(author));
        }
        return Optional.empty();
    }

    public void delete(Long id) {
        authorRepository.deleteById(id);
    }
}
