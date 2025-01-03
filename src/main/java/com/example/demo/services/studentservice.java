package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.student;
import com.example.demo.repository.studentrepo;

@Service
public class studentservice {
	@Autowired
	studentrepo sr;

	public student addStudent(student s) {
		return this.sr.save(s);
	}

	public String deletebyid(int id) {
		this.sr.deleteById(id);
		return "deleted successfully " + id;
	}
	public String findbyid(int id) {
		this.sr.findById(id);
		return "Find succesfully " + id;
	}
}
