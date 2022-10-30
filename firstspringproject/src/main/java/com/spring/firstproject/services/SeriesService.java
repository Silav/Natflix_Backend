package com.spring.firstproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.firstproject.domain_models.Content;
import com.spring.firstproject.domain_models.Series;
import com.spring.firstproject.repositories.SeriesRepository;

@Service
public class SeriesService {
	
	@Autowired
	private SeriesRepository repo;
	
	public List<Series> listAll(){
		return repo.findAll();
	}
	public void save(Series series) {
		repo.save(series);
	}
	public Series get(Integer id) {
		return repo.findById(id).get();
	}
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
