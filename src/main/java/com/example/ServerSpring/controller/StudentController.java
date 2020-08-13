package com.example.ServerSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerSpring.entity.Student;
import com.example.ServerSpring.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@GetMapping("/getAll")
	public List<Student> getAll(){
//		Student stu = new Student("PC00378", "Ha Minh Sang", 20);
//		service.save(stu);
		return service.findAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Student stu) {
		service.save(stu);
	}
	
	@GetMapping("/find{id}")
	public Student findById(@PathVariable("id") String id) {
		return service.findById(id).get();
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Student stu) {
		service.save(stu);
	}
	@DeleteMapping("/delete{id}")
	public void deleteByID(@PathVariable("id") String id) {
		service.deleteById(id);
	}
	@DeleteMapping("/delete")
	public void deleteEntity(@RequestBody Student stu) {
		service.delete(stu);
	}
}
