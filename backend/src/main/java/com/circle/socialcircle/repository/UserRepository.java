package com.circle.socialcircle.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.circle.socialcircle.model.User;

public interface UserRepository extends MongoRepository<User, String> {
  Boolean existsByEmail(String email);
}
