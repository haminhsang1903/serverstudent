package com.example.ServerSpring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ServerSpring.entity.Clazz;

public interface ClazzRespository extends JpaRepository<Clazz, String>{
	@Query(value = "SELECT * FROM Clazz WHERE name = ?1", nativeQuery = true)
	Clazz findByName(String name);
}
