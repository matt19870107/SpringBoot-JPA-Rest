package com.ma.boot.jpa.rest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface PersonResponsitory extends JpaRepository<Person, Long> {
	
	@RestResource(path="nameStartsWith",rel="nameStartsWith")
	Person findByNameStartsWith(@Param("name") String name);
	
}
