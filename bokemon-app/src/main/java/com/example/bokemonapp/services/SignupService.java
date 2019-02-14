package com.example.bokemonapp.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.bokemonapp.model.*;

@Repository
public interface SignupService extends CrudRepository<Signup, Integer> {
//    Iterable<Signup>findByusername(String username);
}
