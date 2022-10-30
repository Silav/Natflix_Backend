package com.spring.firstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.firstproject.domain_models.Content_Category;
import com.spring.firstproject.domain_models.Content_Type;
import com.spring.firstproject.repositories.Content_CategoryRepository;
import com.spring.firstproject.repositories.Content_TypeRepository;

@Service
public class Content_CategoryService {

	@Autowired
	private Content_CategoryRepository repo;
	
	public Content_Category saveContentCatogory(Content_Category content_category) {		
			return	repo.save(content_category);
		};
		
		public Content_Category getbyCategory(String category) {
			return repo.getByCategory(category);
		}
}
