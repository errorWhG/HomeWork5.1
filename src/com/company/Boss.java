package com.company;

public class Boss {
    private String chooseBossDefence;
    private int Damage;
    private int Health;

    public String getChooseBossDefence() {
        return chooseBossDefence;
    }

    public void setChooseBossDefence(String chooseBossDefence) {
        this.chooseBossDefence = chooseBossDefence;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getHealth() {
        return Health;
    }
}

