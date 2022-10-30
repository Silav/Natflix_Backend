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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.spring.firstproject.domain_models.Content;
import com.spring.firstproject.domain_models.Content_Category;
import com.spring.firstproject.domain_models.Content_Type;
import com.spring.firstproject.services.ContentService;
import com.spring.firstproject.services.Content_CategoryService;
import com.spring.firstproject.services.Content_TypeService;


@RestController
public class ContentController {
	
	@Autowired
	private ContentService service;
	@Autowired
	private Content_TypeService content_TypeService;	
	@Autowired
	private Content_CategoryService content_CategoryService;
	
//	@GetMapping("/test")
//	public Integer test(){
//		return 1;
//	}

	@GetMapping("/content")
	@CrossOrigin(origins = "http://localhost:8082")
	public List<Content> list(){
		return service.listAll();
	}
	
	@GetMapping("/content/{id}")
	public ResponseEntity<Content> get(@PathVariable Integer id) {
	    try {
	        Content content = service.get(id);
	        return new ResponseEntity<Content>(content, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Content>(HttpStatus.NOT_FOUND);
	    }
	}
	
	@PostMapping("/postcontent")
	@CrossOrigin(origins = "http://localhost:8082")
	public String add(@RequestBody Content content) {
		Content_Type content_Type= new Content_Type();
		content_Type=content_TypeService.getbyType(content.getType().getType());
		Content_Category content_Category= new Content_Category();
		content_Category = content_CategoryService.getbyCategory(content.getCategory().getCategory());
        
        content.setCategory(content_Category);
		content.setType(content_Type);
//		System.out.println("EEE");
		System.out.println(content.toString());
//		System.out.println("EEE");
		
		service.save(content);
		return "Successfully Added";
	}
	
	@PutMapping("/content/{id}")
	public ResponseEntity<?> update(@RequestBody Content content, @PathVariable Integer id) {
	    try {
	        Content exist = service.get(id);
	        Content_Type content_Type=content_TypeService.getbyType(content.getType().getType());
	        Content_Category content_Category = content_CategoryService.getbyCategory(content.getCategory().getCategory());
	        content_Type.setType(content.getType().getType());
	        exist.setBanner_url(content.getBanner_url());
	        exist.setLogo_url(content.getLogo_url());
	        exist.setPoster_url(content.getPoster_url());
	        exist.setSummary(content.getSummary());
	        exist.setThumbnail_url(content.getThumbnail_url());
	        exist.setTitle(content.getTitle());
	        exist.setType(content_Type);
	        exist.setCategory(content_Category);
	       // contentTypeService.saveContentType(content_Type);
	        service.save(exist);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	@DeleteMapping("/content/{id}")
	public void delete(@PathVariable Integer id) {
	    service.delete(id);
	}
}
