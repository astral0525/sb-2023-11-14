package com.ll.sb20231114.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArticleController {

    @GetMapping("/article/write")
    String showWrite(){
        return "article/write";
    }

}
/*
@AllArgsConstructor
@Getter
class Article{
    private long id;
    private String title;
    private String body;
}
*/