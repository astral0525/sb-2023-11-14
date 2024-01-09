package com.ll.sb20231114.domain.home.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    String showMain(){
        return "안녕하세요";
    }

    @GetMapping("/about")
    @ResponseBody
    String showAbout(){
        return "개발자 커뮤니티";
    }

    @GetMapping("/calc")
    @ResponseBody
    String showCalc(){
        return "계산기";
    }
    @GetMapping("/calc3")
    @ResponseBody
    String showCalc(
            @RequestParam(defaultValue="0") String a,
            @RequestParam(defaultValue= "0") String b
    ){
        return "계산 결과 : %s".formatted(a+b);
    }

    @GetMapping("/calc20")
    String showCalc20(){
        return "calc20";
    }

    @GetMapping("/calc21")
    String showCalc21(Model model){
        model.addAttribute("v1", "안녕");
        model.addAttribute("v2", "반가워");
        return "calc21";
    }

    int i =0;
    @GetMapping("/calc22")
    @ResponseBody
    int showCalc22(){
        i++;
        return i;
    }
}
