package com.example.bokemonapp.services;

import com.example.bokemonapp.model.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BokemonService extends CrudRepository<Bokemon, Integer> {

}
