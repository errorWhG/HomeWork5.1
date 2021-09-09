package com.company;

public class Hero {
    private int Damage;
    private int Health;
    private String HeroesAttackType;

    public Hero(int health, int damage, String heroesAttackType) {
        Damage = damage;
        Health = health;
        HeroesAttackType = heroesAttackType;
    }

    public Hero(int health, int damage) {
        Damage = damage;
        Health = health;
    }

    public String getHeroesAttackType() {
        return HeroesAttackType;
    }

    public int getDamage() {
        return Damage;
    }

    public int getHealth() {
        return Health;
    }
}
