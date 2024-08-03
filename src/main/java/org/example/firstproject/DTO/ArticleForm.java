package org.example.firstproject.DTO;

import org.example.firstproject.entity.Article;

public class ArticleForm {
    private String title; // 제목 받을 필드
    private String content; // 내용 받을 필드

    public ArticleForm(String title, String content){
        this.title = title;
        this.content = content;
    }

    @Override

    // 데이터를 잘 받았는지 확인할 toString() 메서드
    public String toString(){
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity(){
        return new Article(null, title, content);
    }
}
