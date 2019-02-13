package com.example.bokemonapp.model;

import javax.persistence.*;

@Entity
public class World {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private int worldMap;

    @Column
    @Lob
    private String players;

    public World() {}

    public World(int id, String name, int worldMap, String players) {
        this.id = id;
        this.name = name;
        this.worldMap = worldMap;
        this.players = players;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPlayers() {
        return players;
    }

    public int getWorldMap() {
        return worldMap;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(String players) {
        this.players = players;
    }

    public void setWorldMap(int worldMap) {
        this.worldMap = worldMap;
    }
}
