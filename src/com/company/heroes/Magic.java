package com.company.heroes;

import com.company.boss.Boss;
import com.company.heroes.Hero;

import java.util.Random;

public class Magic extends Hero {

    public Magic(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        int isAvailable = new Random().nextInt(2);
        if (isAvailable == 1){
            int damage = new Random().nextInt(150);
            for (Hero hero : heroes){
                hero.setDamage(hero.getDamage() + damage);
            }
            System.out.println("Magic boosted heroes damage on - " + damage);
        }
    }
}
