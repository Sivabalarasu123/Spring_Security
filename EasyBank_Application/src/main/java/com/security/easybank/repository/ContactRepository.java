package com.security.easybank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.security.easybank.entity.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	
}