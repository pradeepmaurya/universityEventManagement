package com.university.event.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.university.event.model.Student;

@Component
public class StudentServices {
	
	public static ArrayList<Student> list = new ArrayList<>();
	static {
		list.add(new Student(1,"Pradeep", "Maurya",23,"ECE"));
		list.add(new Student(2,"Rohan", "Yadav",24,"CSE"));
		list.add(new Student(3,"Mohan", "Gupta",25,"ME"));
		list.add(new Student(4,"Aman", "Verma",23,"CSE"));
		list.add(new Student(5,"Ram", "Krishna",26,"IT"));
	}
	
	//Getting all list of student
	public List<Student> getAllStudent(){
		return list;
	}
	
	//Get Student by Id
	public Student getStudent(int id) {
		for(Student data:list) {
			if(data.getStudentId() == id) {
				return data;
			}
		}
		return null;
	}
	
	//Add Student data
	public String addStudent(Student data) {
		list.add(data);
		return "Succesfully Added";
	}
	
	//Delete Student data
	public String deleteStudent(int id) {
		for(Student data:list) {
			if(data.getStudentId() == id) {
				list.remove(data);
				return "Removed Succesfully";
			}
		}
		return "Failled Due to some Reason";
	}
	
	//Updating data of Student
	public String updateStudent(Student data, int id) {
		for(Student student:list) {
			if(student.getStudentId() == id) {
				student.setStudentId(data.getStudentId());
				student.setFirstName(data.getFirstName());
				student.setLastName(data.getLastName());
				student.setAge(data.getAge());
				student.setDepartment(data.getDepartment());
				
				return "Succesfully Updated";
			}
		}
		return "Failled due to some Reason";
	}
	
	//
}
