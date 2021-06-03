package com.company;

import java.util.Objects;

public class Warrior extends BaseClass{
    private int shieldStrength = 100;

    public Warrior(String name){
        super(name);
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
    }

    public void decreaseShieldStrength(int damageValue){
        System.out.println("Oh no! My shield received and attack");
        this.setShieldStrength(this.getShieldStrength() - damageValue);
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public static void main(String[] args) {
        Warrior xena = new Warrior("Xena");

        System.out.println(xena.getShieldStrength());
        xena.decreaseShieldStrength(15);
        System.out.println(xena.getShieldStrength());
    }
}
