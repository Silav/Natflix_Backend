package com.spring.firstproject.domain_models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "`details_series`")
public class Series {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="content_id") 
	private Content content;
	
	private Integer season_number;
	private Integer episode_number;
	private String title;
	private String summary;
	private String thumbnail_url;
	private String vedio_code;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSeason_number() {
		return season_number;
	}
	public void setSeason_number(Integer season_number) {
		this.season_number = season_number;
	}
	public Integer getEpisode_number() {
		return episode_number;
	}
	public void setEpisode_number(Integer episode_number) {
		this.episode_number = episode_number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getThumbnail_url() {
		return thumbnail_url;
	}
	public void setThumbnail_url(String thumbnail_url) {
		this.thumbnail_url = thumbnail_url;
	}
	public String getVedio_code() {
		return vedio_code;
	}
	public void setVedio_code(String vedio_code) {
		this.vedio_code = vedio_code;
	}
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
	
	
	
	
}
