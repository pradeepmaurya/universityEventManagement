package com.university.event.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//@NoArgsConstructor
public class Student {
	private int studentId;
	private String firstName;
	private String lastName;
	private int age;
	private String department;
//	public int getStudentId() {
//		return studentId;
//	}
//	public void setStudentId(int studentId) {
//		this.studentId = studentId;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getDepartment() {
//		return department;
//	}
//	public void setDepartment(String department) {
//		this.department = department;
//	}
//	
//	
//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Student(int studentId, String firstName, String lastName, int age, String department) {
//		super();
//		this.studentId = studentId;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.age = age;
//		this.department = department;
//	}
//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
//				+ age + ", department=" + department + "]";
//	}
	
	
}
