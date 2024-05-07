package com.circle.socialcircle.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.circle.socialcircle.model.User;

public interface UserRepository extends MongoRepository<User, String> {
  Boolean existsByEmail(String email);


  // @Query(value = "{'email': ?'notAnExistingEmail@socialcircle'}")
  List<User> findByEmail(String email);
}
