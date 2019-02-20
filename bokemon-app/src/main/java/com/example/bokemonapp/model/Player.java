package com.example.bokemonapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String username;
    private String password;
    private int world;
    private String sprite;
    private int x;
    private int y;
    private String bokemons;

    public Player() {}

    public Player(int id, String username, String password, int world, String sprite, int x, int y, String bokemons) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.world = world;
        this.sprite = sprite;
        this.x = x;
        this.y = y;
        this.bokemons = bokemons;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getWorld() {
        return world;
    }

    public String getSprite() {
        return sprite;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setWorld(int world) {
        this.world = world;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getBokemons() { return bokemons; }

    public void setBokemons(String bokemons) { this.bokemons = bokemons; }
}
