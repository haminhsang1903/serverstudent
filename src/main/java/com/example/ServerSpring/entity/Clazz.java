package com.example.ServerSpring.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Clazz {
	@Id
	private String id;
	
	@Column(name = "name", columnDefinition = "NVARCHAR(50)")
	private String name;
	
	@OneToMany(mappedBy = "id_class", fetch = FetchType.EAGER)
	private Collection<Student> students;

//	public Collection<Student> getStudents() {
//		return students;
//	}
//
//	public void setStudents(Collection<Student> students) {
//		this.students = students;
//	}

	public Clazz(String id, String name
			//, Collection<Student> students
			) {
		super();
		this.id = id;
		this.name = name;
		//this.students = students; 
	}

	public Clazz() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
