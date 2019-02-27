package com.example.bokemonapp.model;

import javax.persistence.*;

@Entity
public class Bokemon implements Comparable<Bokemon> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int maxHp;
    private int hp;
    private int atk;
    private int def;
    private int spd;
    private int lvl;
    private int exp;
    private boolean mainBokemon;

    @OneToOne
    private MonsterTemplate template;

//    @ManyToOne
//    private Player player;

//    public Bokemon(String name){
//        this.name = name;
//    }




    public Bokemon(){}

    public Bokemon(int id, MonsterTemplate template, String name, int maxHp, int hp, int atk, int def, int spd, int lvl, int exp, boolean mainBokemon){
        this.id = id;
        this.template = template;
        this.name = name;
        this.maxHp = maxHp;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
        this.lvl = lvl;
        this.exp = exp;
        this.mainBokemon = mainBokemon;
    }



    public int getId() { return id;    }

    public void setId(int id) { this.id = id;    }

    public MonsterTemplate getTemplate() { return template; }

    public void setTemplate(MonsterTemplate template) { this.template = template; }

//    public Player getPlayer() { return player; }
//
//    public void setPlayer(Player player) { this.player = player; }

    public String getName() { return name;    }

    public void setName(String name) { this.name = name;    }

    public int getMaxHp() { return maxHp; }

    public void setMaxHp(int maxHp) { this.maxHp = maxHp; }

    public int getHp() { return hp;    }

    public void setHp(int hp) { this.hp = hp;    }

    public int getAtk() { return atk;    }

    public void setAtk(int atk) { this.atk = atk;    }

    public int getDef() { return def;    }

    public void setDef(int def) { this.def = def;    }

    public int getSpd() { return spd;    }

    public void setSpd(int spd) { this.spd = spd;    }

    public int getLvl() { return lvl;    }

    public void setLvl(int lvl) { this.lvl = lvl;    }

    public int getExp() { return exp;    }

    public void setExp(int exp) { this.exp = exp;    }

    public boolean isMainBokemon() { return mainBokemon; }

    public void setMainBokemon(boolean mainBokemon) { this.mainBokemon = mainBokemon; }



    @Override
    public int compareTo(Bokemon o) {
        if (mainBokemon) {
            return -1;
        } else {
            return 1;
        }
    }
}


