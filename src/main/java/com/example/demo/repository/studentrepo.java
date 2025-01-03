package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.student;

@Repository
public interface studentrepo extends CrudRepository<student, Integer> {
	
}
