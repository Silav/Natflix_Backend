package com.spring.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.firstproject.domain_models.Series;

public interface SeriesRepository extends JpaRepository<Series, Integer>{

}
