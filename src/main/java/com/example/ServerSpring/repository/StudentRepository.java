package com.example.ServerSpring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ServerSpring.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, String>{
	@Query("from Student stu join Clazz cla ON stu.clazz.id = cla.id where stu.clazz = :idClazz")
	public List<Student> findByClazzId(@Param("idClazz") String idClazz);
}
