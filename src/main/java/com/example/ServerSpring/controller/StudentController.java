package com.example.ServerSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerSpring.entity.Clazz;
import com.example.ServerSpring.entity.Student;
import com.example.ServerSpring.service.ClazzService;
import com.example.ServerSpring.service.StudentService;


@RestController
public class StudentController {
	@Autowired
	StudentService service;

	
	@GetMapping({ "/getAllStudent", "/" })
	public List<Student> getAll() {
		return service.findAll();
	}

	@PostMapping({"/student"})
	public void add(@RequestBody Student stu) {
		service.save(stu);
	}

	
	
	@GetMapping("/findStudent{id}")
	public Student findById(@PathVariable("id") String id) {
		return service.findById(id).get();
	}

	@PutMapping("/student")
	public void update(@RequestBody Student stu) {
		service.save(stu);
	}

	@DeleteMapping("/student{id}")
	public void deleteByID(@PathVariable("id") String id) {
		service.deleteById(id);
	}

	@DeleteMapping("/student")
	public void deleteEntity(@RequestBody Student stu) {
		service.delete(stu);
	}
	@GetMapping("/findStudentIdClazz/{id}")
	public List<Student> findByClazzId(@PathVariable("id") String id) {
		return service.findByClazzId(id);
	}
}
