package com.example.ServerSpring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student implements Serializable{
	@Id
	private String massv;
	
	private String name;
	
	private int age;
	
	@ManyToOne
	private Clazz clazz;
	
	
	
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	public Student(String massv, String name, int age, Clazz clazz) {
		super();
		this.massv = massv;
		this.name = name;
		this.age = age;
		this.clazz = clazz;
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
