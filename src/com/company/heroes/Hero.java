package com.company.heroes;

import com.company.GameEntity;
import com.company.IAbility;

public abstract class Hero extends GameEntity implements IAbility {

    public Hero(int health, int damage) {
        super(health, damage);
    }
}
