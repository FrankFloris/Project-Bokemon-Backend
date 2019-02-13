package com.example.bokemonapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String sprite;
    private boolean open;
    private boolean monsters;

    public Tile() {}

    public Tile(int id, String name, String sprite, boolean open, boolean monsters) {
        this.id = id;
        this.name = name;
        this.sprite = sprite;
        this.open = open;
        this.monsters = monsters;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSprite() {
        return sprite;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isMonsters() {
        return monsters;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void setMonsters(boolean monsters) {
        this.monsters = monsters;
    }
}
