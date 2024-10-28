package com.cms.service;
import com.cms.models.Article;
import com.cms.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;
    @Autowired
    public ArticleService(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }
    public List<Article> getAllArticles(){
        return articleRepository.findAll();
    }
    public Optional<Article> getArticleById(Long id ){
        return articleRepository.findById(id);
    }
    public Article saveArticle(Article article){
        return articleRepository.save(article);
    }
    public Optional<Article> update(Long id , Article article){
        if(articleRepository.existsById(id)){
            article.setId(id);
            return Optional.of(articleRepository.save(article));
        }
        return Optional.empty();
    }
    public void delete(Long id ){
        articleRepository.deleteById(id);
    }
}
