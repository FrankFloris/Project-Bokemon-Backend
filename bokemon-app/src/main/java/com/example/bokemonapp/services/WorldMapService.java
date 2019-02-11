package com.example.bokemonapp.services;

import com.example.bokemonapp.model.WorldMap;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorldMapService extends CrudRepository<WorldMap, Integer> {
}
