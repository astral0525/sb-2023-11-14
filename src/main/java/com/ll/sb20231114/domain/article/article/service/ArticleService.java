package com.ll.sb20231114.domain.article.article.service;


import com.ll.sb20231114.domain.article.article.entity.Article;
import com.ll.sb20231114.domain.article.article.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // 단 한번만 생성되고, 그 이후에는 재사용 객체입니다.
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;


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
