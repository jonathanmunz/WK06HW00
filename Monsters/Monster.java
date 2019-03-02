package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Random;

public abstract class Monster {

    private Integer hp;
    private Integer xp;
    protected Integer agi = 1;
    protected Integer def = 1;
    protected Integer str = 1;
    protected Attack attack;
    private Integer maxHP;
    private HashMap<String, Integer> items;

//constructor
    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

//getters
    public Integer getAgi() {
        return agi;
    }

    public Integer getDef() {
        return def;
    }

    public Integer getStr() {
        return str;
    }

    public Attack getAttack() {
        return attack;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(Integer maxHP) {
        this.maxHP = maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer attackTarget(Monster target) {
        System.out.println(this + " uses a *** attack on " + target);
        this.getAttack();
        return 9;
    }

    public boolean equals(Object name) {
        return true;
    }

    public int hashCode() {
        return 1;
    }

    @Override
    public String toString () {
        return "hp= " + this.hp + "/" + maxHP;
    }

    Integer getAttribute(Integer min, Integer max){
        Random rand = new Random();
        if(min > max){
            Integer temp = min;
            min = max;
            max = temp;
        }

        //returns a random number between min and max inclusive

        return rand.nextInt(max-min) + min;
    }

}
