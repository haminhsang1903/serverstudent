package com.example.ServerSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ServerSpring.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String>{

}
