package com.example.bokemonapp.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String username;
    String password;

    public Login() {}

    public Login(int id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
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

    @Override
    public String toString(){
        return "[Login: [" + "id: " + id + ", " + "username: " + username + ", " + "password: " + password + "]";
    }





}