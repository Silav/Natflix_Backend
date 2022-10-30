package com.spring.firstproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.firstproject.domain_models.*;
import com.spring.firstproject.repositories.ContentRepository;

@Service
public class ContentService {

	@Autowired
	private ContentRepository repo;
	
	public List<Content> listAll(){
		return repo.findAll();
	}
	public void save(Content content) {
		repo.save(content);
	}
	public Content get(Integer id) {
		return repo.findById(id).get();
	}
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
}
