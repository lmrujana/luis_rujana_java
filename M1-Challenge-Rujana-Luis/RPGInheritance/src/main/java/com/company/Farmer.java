package com.company;

public class Farmer extends BaseClass{
    public Farmer(String name) {
        super(name);
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);
    }

    public void plow(){
        this.decreaseStamina(5);
        System.out.println(this.getName() + "is plowing!");
    }

    public void harvest(){
        this.decreaseStamina(3);
        System.out.println(this.getName() + "is harvesting!");
    }

    public static void main(String[] args) {
        Farmer randy = new Farmer("Randy");

        System.out.println(randy);
        randy.plow();
        randy.harvest();
        System.out.println(randy);
    }
}
