package com.nhom18.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.nhom18.entity.Document;

@Transactional
public interface DocumentDao extends CrudRepository<Document, Integer>{
	
	  public Document findById(Integer id);

}
