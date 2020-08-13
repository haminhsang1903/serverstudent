package com.example.ServerSpring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private String massv;
	
	private String name;
	
	private int age;
	public Student(String massv, String name, int age) {
		super();
		this.massv = massv;
		this.name = name;
		this.age = age;
	}
	public String getMassv() {
		return massv;
	}
	public void setMassv(String massv) {
		this.massv = massv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student() {}
}
