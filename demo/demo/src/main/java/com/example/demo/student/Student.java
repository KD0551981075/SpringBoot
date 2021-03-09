package com.example.demo.student;

import java.time.LocalDate;

public class Student {
	private long id;
	private String name;
	private String emailId;
	private LocalDate dob;
	private Integer age;
	public Student(long id, String name, String emailId, LocalDate dob, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.dob = dob;
		this.age = age;
	}
	public Student(String name, String emailId, LocalDate dob, Integer age) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.dob = dob;
		this.age = age;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", emailId=" + emailId + ", dob=" + dob + ", age=" + age + "]";
	}
	
	

}
