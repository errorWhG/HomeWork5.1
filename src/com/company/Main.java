package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(100000);
        boss.setDamage(100000000);
        boss.setChooseBossDefence(" Saitama");
        System.out.println(boss.getHealth() + ", " + boss.getDamage() + ", " + boss.getChooseBossDefence());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + " " +
                    "" + createHeroes()[i].getDamage() + " " +
                    "" + createHeroes()[i].getHeroesAttackType());
        }
    }

    public static Hero[] createHeroes() {
        Hero heroItachi = new Hero(2090, 205, " Itachi");
        Hero heroIronMan = new Hero(2010, 200, " IronMan ");
        Hero heroBatman = new Hero(2500, 1230, " Batman");

        Hero[] superHero = {heroItachi , heroIronMan, heroBatman};
        return superHero;
    }
}
