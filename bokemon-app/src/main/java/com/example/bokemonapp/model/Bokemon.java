package com.example.bokemonapp.model;

import javax.persistence.*;

@Entity
public class Bokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int hp;
    private int atk;
    private int def;
    private int spd;
    private int lvl;
    private int exp;

    @OneToOne
    private MonsterTemplate template;


    public Bokemon(){}

    public Bokemon(int id, MonsterTemplate template, String name, int hp, int atk, int def, int spd, int lvl, int exp){
        this.id = id;
        this.template = template;
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
        this.lvl = lvl;
        this.exp = exp;
    }



    public int getId() { return id;    }

    public void setId(int id) { this.id = id;    }

    public MonsterTemplate getTemplate() { return template; }

    public void setTemplate(MonsterTemplate template) { this.template = template; }

    public String getName() { return name;    }

    public void setName(String name) { this.name = name;    }

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

}


