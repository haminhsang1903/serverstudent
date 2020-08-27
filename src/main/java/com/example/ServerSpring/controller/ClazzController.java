package com.example.ServerSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServerSpring.entity.Clazz;
import com.example.ServerSpring.entity.Student;
import com.example.ServerSpring.repository.ClazzRespository;

@RestController
public class ClazzController {
	@Autowired
	ClazzRespository clazzRespository;
	
	@GetMapping({ "/getAllClazz"})
	public List<Clazz> getAll() {
		return clazzRespository.findAll();
	}

	@PostMapping({"/clazz"})
	public void add(@RequestBody Clazz cla) {
		clazzRespository.save(cla);
	}

	
	
	@GetMapping("/findClazz{id}")
	public Clazz findById(@PathVariable("id") String id) {
		return clazzRespository.findById(id).get();
	}

	@PutMapping("/clazz")
	public void update(@RequestBody Clazz cla) {
		clazzRespository.save(cla);
	}

	@DeleteMapping("/clazz{id}")
	public void deleteByID(@PathVariable("id") String id) {
		clazzRespository.deleteById(id);
	}

	@DeleteMapping("/clazz")
	public void deleteEntity(@RequestBody Clazz cla) {
		clazzRespository.delete(cla);
	}
	@GetMapping("findName/{name}")
	public Clazz findByName(@PathVariable("name") String name) {
		return clazzRespository.findByName(name);
	}
}
