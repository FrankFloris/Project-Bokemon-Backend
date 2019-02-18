package com.example.bokemonapp.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.bokemonapp.model.*;

@Repository
public interface LoginService extends CrudRepository<Signup, Integer> {
//    Iterable<Signup>findByUsernameAndPassword(String username, String password);

}