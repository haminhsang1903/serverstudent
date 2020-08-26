package com.example.ServerSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.ServerSpring.entity.Clazz;
import com.example.ServerSpring.repository.ClazzRespository;

@Service
public class ClazzService implements ClazzRespository{
	
	@Autowired
	ClazzRespository clazzrepo;
	
	
	@Override
	public List<Clazz> findAll() {
		// TODO Auto-generated method stub
		return clazzrepo.findAll();
	}

	@Override
	public List<Clazz> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Clazz> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Clazz> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Clazz> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Clazz> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Clazz getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Clazz> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Clazz> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Clazz> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Clazz> S save(S entity) {
		// TODO Auto-generated method stub
		return clazzrepo.save(entity);
	}

	@Override
	public Optional<Clazz> findById(String id) {
		// TODO Auto-generated method stub
		return clazzrepo.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		clazzrepo.deleteById(id);
		
	}

	@Override
	public void delete(Clazz entity) {
		clazzrepo.delete(entity);
		
	}

	@Override
	public void deleteAll(Iterable<? extends Clazz> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Clazz> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Clazz> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Clazz> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Clazz> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
