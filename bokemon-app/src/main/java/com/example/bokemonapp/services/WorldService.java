package com.example.bokemonapp.services;

import com.example.bokemonapp.model.World;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorldService extends CrudRepository<World, Integer> {
}
