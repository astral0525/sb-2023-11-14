package com.ll.sb20231114.domain.article.article.service;


import com.ll.sb20231114.domain.article.article.entity.Article;
import com.ll.sb20231114.domain.article.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;


    public Article write(String title, String body) {
        Article article = new Article(title, body);
        articleRepository.save(article);

        return article;
    }

    public Article findLastArticle() {
        return articleRepository.findlastArticle();
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }
}
