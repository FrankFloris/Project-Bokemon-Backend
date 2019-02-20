package com.example.bokemonapp.model;

import javax.persistence.*;
import java.util.Set;
import java.util.HashSet;

@Entity
public class MonsterTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String sprite;
    private int baseHp;
    private int deltaHp;
    private int baseAtk;
    private int deltaAtk;
    private int baseDef;
    private int deltaDef;
    private int baseSpd;
    private int deltaSpd;

    private int bokemonType;

//    @OneToMany(mappedBy = "template")
//    private Set<Bokemon> bokemon = new HashSet<>();
//
//    public void addBokemon(Bokemon bokemon){
//        this.bokemon.add(bokemon);
//    }

    public MonsterTemplate(){}

    public MonsterTemplate(int id, String name, String sprite, int baseHp, int deltaHP,
                           int baseAtk, int deltaAtk, int baseDef, int deltaDef,
                           int baseSpd, int deltaSpd, int bokemonType){
        this.id = id;
        this.name = name;
        this.sprite = sprite;
        this.baseHp = baseHp;
        this.deltaHp = deltaHP;
        this.baseAtk = baseAtk;
        this.deltaAtk = deltaAtk;
        this.baseDef = baseDef;
        this.deltaDef = deltaDef;
        this.baseSpd = baseSpd;
        this.deltaSpd = deltaSpd;
        this.bokemonType = bokemonType;
    }

//    public Set<Bokemon> getBokemon() {
//        return bokemon;
//    }
//
//    public void setBokemon(Set<Bokemon> bokemon) {
//        this.bokemon = bokemon;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public int getBaseHp() {
        return baseHp;
    }

    public void setBaseHp(int baseHp) {
        this.baseHp = baseHp;
    }

    public int getDeltaHp() {
        return deltaHp;
    }

    public void setDeltaHp(int deltaHp) {
        this.deltaHp = deltaHp;
    }

    public int getBaseAtk() {
        return baseAtk;
    }

    public void setBaseAtk(int baseAtk) {
        this.baseAtk = baseAtk;
    }

    public int getDeltaAtk() {
        return deltaAtk;
    }

    public void setDeltaAtk(int deltaAtk) {
        this.deltaAtk = deltaAtk;
    }

    public int getBaseDef() {
        return baseDef;
    }

    public void setBaseDef(int baseDef) {
        this.baseDef = baseDef;
    }

    public int getDeltaDef() {
        return deltaDef;
    }

    public void setDeltaDef(int deltaDef) {
        this.deltaDef = deltaDef;
    }

    public int getBaseSpd() {
        return baseSpd;
    }

    public void setBaseSpd(int baseSpd) {
        this.baseSpd = baseSpd;
    }

    public int getDeltaSpd() {
        return deltaSpd;
    }

    public void setDeltaSpd(int deltaSpd) {
        this.deltaSpd = deltaSpd;
    }

    public int getBokemonType() {
        return bokemonType;
    }

    public void setBokemonType(int bokemonType) {
        this.bokemonType = bokemonType;
    }
}
