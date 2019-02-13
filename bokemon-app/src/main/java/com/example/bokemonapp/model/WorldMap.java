package com.example.bokemonapp.model;

import javax.persistence.*;

@Entity
public class WorldMap {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private int width;
    private int height;

    @Column
    @Lob
    private String tiles;

    private int emptyTile;

    public WorldMap() {}

    public WorldMap(int id, String name, int width, int height, String tiles, int emptyTile) {
        this.id = id;
        this.name = name;
        this.width = width;
        this.height = height;
        this.tiles = tiles;
        this.emptyTile = emptyTile;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getTiles() {
        return tiles;
    }

    public int getEmptyTile() {
        return emptyTile;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTiles(String tiles) {
        this.tiles = tiles;
    }

    public void setEmptyTile(int emptyTile) {
        this.emptyTile = emptyTile;
    }
}
