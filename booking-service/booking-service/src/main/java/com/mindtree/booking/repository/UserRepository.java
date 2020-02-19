package com.mindtree.booking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.booking.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
    User findByUsername(String username);

}
