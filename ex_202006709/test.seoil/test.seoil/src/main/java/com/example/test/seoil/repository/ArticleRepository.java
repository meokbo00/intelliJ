package com.example.test.seoil.repository;

import com.example.test.seoil.controller.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
