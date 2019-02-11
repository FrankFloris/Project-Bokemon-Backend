package com.example.bokemonapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WorldMap {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private int[][] tiles;
    private int emptyTile;

    public WorldMap() {}

    public WorldMap(int id, String name, int[][] tiles, int emptyTile) {
        this.id = id;
        this.name = name;
        this.tiles = tiles;
        this.emptyTile = emptyTile;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[][] getTiles() {
        return tiles;
    }

    public int getEmptyTile() {
        return emptyTile;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTiles(int[][] tiles) {
        this.tiles = tiles;
    }

    public void setEmptyTile(int emptyTile) {
        this.emptyTile = emptyTile;
    }
}
