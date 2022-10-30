package com.spring.firstproject.domain_models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "`content_category`")
public class Content_Category {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String category;
	
	public Content_Category(){
		
	}

	public Content_Category(Integer id, String category) {
		this.id = id;
		this.category = category;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
