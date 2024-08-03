package org.example.firstproject.repository;

import org.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

// <관리 대상 엔티티의 클래스 타입, 대표값 타입>
// CrudReppository 상속 -> DB에 데이서 생성, 읽기, 수정, 삭제를 추가 코드없이 사용가능
public interface ArticleRepository extends CrudRepository<Article,Long> {

}
