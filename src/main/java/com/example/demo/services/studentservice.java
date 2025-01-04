package com.example.demo.services;

import java.util.List;
import java.util.Optional;

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
	public List<student>getAll(){
		return (List<student>) this.sr.findAll();
	}
	public Optional<student> getById(int id){
		return this.sr.findById(id);
	}
	public student updateStudent(student s) {
		int id =s.getId();
		student st = sr.findById(id).get();
		st.setName(s.getName());
		st.setEmail(s.getEmail());
		st.setPassword(s.getPassword());
		st.setMobileno(s.getMobileno());
		return this.sr.save(st);
	}
	
}