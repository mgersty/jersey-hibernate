package com.example.jerseyhibernate.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.jerseyhibernate.model.User;

public interface UserRepository extends CrudRepository<User, Integer> { 

}
