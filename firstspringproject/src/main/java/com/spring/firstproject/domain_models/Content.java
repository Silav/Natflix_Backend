package com.spring.firstproject.domain_models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TypedQuery;

@Entity
@Table(name = "`content`")
public class Content {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="type_id") 
	private Content_Type type;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="category_id") 
	private Content_Category category;
	
	private String summary;
	private String logo_url;
	private String poster_url;
	private String banner_url;
	private String thumbnail_url;
	
	public Content(){
		
	}
	
	public Content(int id, String title, Content_Type type, Content_Category category, String summary, String logo_url,
			String poster_url, String banner_url, String thumbnail_url) {
		this.id = id;
		this.title = title;
		this.type = type;
		this.category = category;
		this.summary = summary;
		this.logo_url = logo_url;
		this.poster_url = poster_url;
		this.banner_url = banner_url;
		this.thumbnail_url = thumbnail_url;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Content_Type getType() {
		return type;
	}
	public void setType(Content_Type type) {
		this.type = type;
	}
	public Content_Category getCategory() {
		return category;
	}
	public void setCategory(Content_Category category) {
		this.category = category;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getLogo_url() {
		return logo_url;
	}
	public void setLogo_url(String logo_url) {
		this.logo_url = logo_url;
	}
	public String getPoster_url() {
		return poster_url;
	}
	public void setPoster_url(String poster_url) {
		this.poster_url = poster_url;
	}
	public String getBanner_url() {
		return banner_url;
	}
	public void setBanner_url(String banner_url) {
		this.banner_url = banner_url;
	}
	public String getThumbnail_url() {
		return thumbnail_url;
	}
	public void setThumbnail_url(String thumbnail_url) {
		this.thumbnail_url = thumbnail_url;
	}

	@Override
	public String toString() {
		return "Content [id=" + id + ", title=" + title + ", type=" + type + ", category=" + category
				+ ", summary=" + summary + ", logo_url=" + logo_url + ", poster_url=" + poster_url + ", banner_url="
				+ banner_url + ", thumbnail_url=" + thumbnail_url + "]";
	}
	
	
}

