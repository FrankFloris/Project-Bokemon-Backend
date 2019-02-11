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
    private boolean isOpen;
    private boolean hasMonsters;

    public Tile() {}

    public Tile(int id, String name, String sprite, boolean isOpen, boolean hasMonsters) {
        this.id = id;
        this.name = name;
        this.sprite = sprite;
        this.isOpen = isOpen;
        this.hasMonsters = hasMonsters;
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
        return isOpen;
    }

    public boolean isHasMonsters() {
        return hasMonsters;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void setHasMonsters(boolean hasMonsters) {
        this.hasMonsters = hasMonsters;
    }
}
