package com.spring.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.firstproject.domain_models.Content_Type;

public interface Content_TypeRepository extends JpaRepository<Content_Type, Integer>{
	
public Content_Type	getByType(String type);

}
