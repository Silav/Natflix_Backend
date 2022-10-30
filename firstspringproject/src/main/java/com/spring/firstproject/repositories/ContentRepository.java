package com.spring.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.firstproject.domain_models.Content;

public interface ContentRepository extends JpaRepository<Content, Integer> {

}
