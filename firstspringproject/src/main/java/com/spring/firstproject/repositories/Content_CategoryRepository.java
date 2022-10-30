package com.spring.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.firstproject.domain_models.Content_Category;
import com.spring.firstproject.domain_models.Content_Type;

public interface Content_CategoryRepository extends JpaRepository<Content_Category, Integer>{

	public Content_Category	getByCategory(String category);

}
