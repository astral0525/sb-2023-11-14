package com.ll.sb20231114.Controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/article/doWrite")
    @ResponseBody
    RsData<Article> doWrite(String title, String body){
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

@AllArgsConstructor
@Getter
class Article{
    private long id;
    private String title;
    private String body;
}

@AllArgsConstructor
@Getter
class RsData<T>{
    private String resultCode;
    private String msg;
    private T data;
}