package com.ll.sb20231114.domain.article.article.controller;

import com.ll.sb20231114.domain.article.article.entity.Article;
import com.ll.sb20231114.global.rsData.RsData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ArticleController {
    private List<Article> articles =  new ArrayList<>();


    @GetMapping("/article/write")
    String showWrite(){
        return "article/write";
    }

    @PostMapping("/article/Write")
    @ResponseBody
    RsData<Article> write(String title, String body){
        long id = articles.size()+1;
        Article article = new Article(id, title, body);
        articles.add(article);

        return new RsData<>("S-1", "성공", article);
    }

    @GetMapping("/article/getLastArticle")
    @ResponseBody
    Article getLastArticle(){
        return articles.getLast();
    }

    @GetMapping("/article/getArticles")
    @ResponseBody
    List<Article> getArticles(){
        return articles;
    }

}

