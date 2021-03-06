package com.devsuperior.workshopmongo2022.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.workshopmongo2022.models.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
