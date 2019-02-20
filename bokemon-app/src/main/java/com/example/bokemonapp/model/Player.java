package com.example.bokemonapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

//    @OneToMany
//    private Set<Bokemon> bokemon = new HashSet<>();

    @OneToOne
    private Bokemon bokemon;

    public Player() {}

    public Player(int id, String username, String password, int world, String sprite, int x, int y, Bokemon bokemon) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.world = world;
        this.sprite = sprite;
        this.x = x;
        this.y = y;
        this.bokemon = bokemon;
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
//
//    public Set<Bokemon> getBokemon() { return bokemon; }
//
//    public void setBokemon(Set<Bokemon> bokemon) { this.bokemon = bokemon; }

    public Bokemon getBokemon() { return bokemon; }

    public void setBokemon(Bokemon bokemon) { this.bokemon = bokemon; }
}
