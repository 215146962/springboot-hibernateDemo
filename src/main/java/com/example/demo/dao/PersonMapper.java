package com.example.demo.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Person;

@Repository
public interface PersonMapper extends CrudRepository<Person, String>{
	
}
