package com.coursespring.course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.coursespring.course.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
