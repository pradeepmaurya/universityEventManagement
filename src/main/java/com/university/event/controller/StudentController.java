package com.university.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.university.event.model.Student;
import com.university.event.services.StudentServices;

@RestController
public class StudentController {
	
	@Autowired
	public StudentServices service;
	
	//Adding Student data
	@PostMapping("/student")
	public String addStudent(@RequestBody Student data) {
		return service.addStudent(data);
	}
	
	//Updating student Data
	@PutMapping("/student/{id}")
	public String updateStudent(@RequestBody Student data, @PathVariable("id") int id) {
		return service.updateStudent(data, id);
	}
	
	//Delete Student Data
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		return service.deleteStudent(id);
	}
	
	//Getting All Student
	@GetMapping("/student")
	public List<Student> getAllStudent(){
		return service.getAllStudent();
	}
	
	//Get Student by ID
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		return service.getStudent(id);
	}
	
}
