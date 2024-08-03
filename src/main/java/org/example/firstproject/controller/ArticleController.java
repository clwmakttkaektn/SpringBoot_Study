package org.example.firstproject.controller;

import org.example.firstproject.DTO.ArticleForm;
import org.example.firstproject.entity.Article;
import org.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;


    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());

        // 1. DTO를 엔티티로 변환
        Article article = form.toEntity();
        // DTO가 엔티티로 잘 변환되는지 확인 출력
        System.out.println(article.toString());

        // 2. 리파지터리로 엔티티를 DB에 저장

        Article saved = articleRepository.save(article);
        // article 이 DB에 잘 저장되는지 확인 출력
        System.out.println(saved.toString());



        return "";
    }


}
