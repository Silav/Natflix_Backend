package com.spring.firstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.firstproject.domain_models.Content_Type;
import com.spring.firstproject.repositories.Content_TypeRepository;

@Service
public class Content_TypeService {
	
	@Autowired
	private Content_TypeRepository repo;
	
	public Content_Type saveContentType(Content_Type content_Type) {
		return	repo.save(content_Type);
	};

	
	public Content_Type getbyType(String type) {
		return repo.getByType(type);
	}
}
