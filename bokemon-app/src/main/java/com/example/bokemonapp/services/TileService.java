package com.example.bokemonapp.services;

import com.example.bokemonapp.model.Tile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TileService extends CrudRepository<Tile, Integer> {

}
