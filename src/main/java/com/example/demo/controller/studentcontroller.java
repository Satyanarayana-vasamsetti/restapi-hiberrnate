package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.student;
import com.example.demo.services.studentservice;

@RestController
@RequestMapping("/api/v1")
public class studentcontroller{
	@Autowired
	studentservice service;

	@PostMapping("/insert")
	public student addStudent(@RequestBody student s) {
		return this.service.addStudent(s);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return this.service.deletebyid(id);
	}
	@GetMapping("/select/{id}")
	public String findbyid(@PathVariable int id) {
		return this.service.findbyid(id);
	}
	@GetMapping("/getAll")
	public List<student>getAll(){
		return this.service.getAll();
	}
	@GetMapping("/getbyid/{id}")
	public Optional<student>getById(@PathVariable int id){
		return this.service.getById(id);
	}
	@PutMapping("/update")
	public student updateStudent(@RequestBody student s) {
		return this.service.updateStudent(s);			
	}
	
}
