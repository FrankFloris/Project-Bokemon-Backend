package com.example.bokemonapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Signup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String username;
    String password;
    int world;
    String sprite;
    int x;
    int y;

    public Signup() {}

    public Signup(int id, String username, String password, int world, String sprite, int x, int y){
        this.id = id;
        this.username = username;
        this.password = password;
        this.world = world;
        this.sprite = sprite;
        this.x = x;
        this.y = y;
    }
    public int getId() {
        return id; }

    public void setId(int id) {
        this.id = id; }

    public String getUsername() {
        return username; }

    public void setUsername(String username) {
        this.username = username; }

    public String getPassword() {
        return password; }

    public void setPassword(String password) {
        this.password = password; }

    public int getWorld() {
        return world;    }

    public void setWorld(int world) {
        this.world = world;    }

    public String getSprite() {
        return sprite;    }

    public void setSprite(String sprite) {
        this.sprite = sprite;    }

    public int getX() {
        return x;    }

    public void setX(int x) {
        this.x = x;    }

    public int getY() {
        return y;    }

    public void setY(int y) {
        this.y = y;    }


    //    @Override
//    public String toString(){
//        return "[Signup: [" + "id: " + id + ", " + "username: " + username + ", " + "password: " + password + "]";
//    }





}
