package com.spring.firstproject.restcontrollers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.firstproject.domain_models.Content;
import com.spring.firstproject.domain_models.Content_Category;
import com.spring.firstproject.domain_models.Content_Type;
import com.spring.firstproject.domain_models.Series;
import com.spring.firstproject.services.ContentService;
import com.spring.firstproject.services.SeriesService;

@RestController
public class SeriesController {
	
	@Autowired
	private SeriesService service;

	@Autowired
	private ContentService content_service;
	
	@GetMapping("/series")
	@CrossOrigin(origins = "http://localhost:8082")
	public List<Series> list(){
		return service.listAll();
	}
	
	@GetMapping("/series/{id}")
	public ResponseEntity<Series> get(@PathVariable Integer id) {
	    try {
	        Series series = service.get(id);
	        return new ResponseEntity<Series>(series, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Series>(HttpStatus.NOT_FOUND);
	    }
	}
	
	@PostMapping("/postseries")
	@CrossOrigin(origins = "http://localhost:8082")
	public String add(@RequestBody Series series) {
//		System.out.println("EEE");
		System.out.println(series.toString());
//		System.out.println("EEE");
		
		service.save(series);
		return "Successfully Added";
	}
	
	@DeleteMapping("/series/{id}")
	public void delete(@PathVariable Integer id) {
	    service.delete(id);
	}


}
