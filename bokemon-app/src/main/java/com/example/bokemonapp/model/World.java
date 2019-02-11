package com.example.bokemonapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class World {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private int[] players;
    private int worldMap;

    public World() {}

    public World(int id, String name, int[] players, int worldMap) {
        this.id = id;
        this.name = name;
        this.players = players;
        this.worldMap = worldMap;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[] getPlayers() {
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

    public void setPlayers(int[] players) {
        this.players = players;
    }

    public void setWorldMap(int worldMap) {
        this.worldMap = worldMap;
    }
}
