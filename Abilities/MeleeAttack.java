package Abilities;

import Abilities.Attack;
import Monsters.Monster;

public class MeleeAttack implements Attack {

    Monster attacker;

    public MeleeAttack(Monster attacker) {

        this.attacker = attacker;
    }


    public Integer attack(Monster target) {
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return attacker.getStr() - target.getDef();
    }
}