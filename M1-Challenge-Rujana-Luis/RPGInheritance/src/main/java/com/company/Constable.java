package com.company;

import java.util.Objects;

public class Constable extends BaseClass{

    private String jurisdiction;

    public Constable(String name, String jurisdiction){
        super(name);
        this.setStrength(60);
        this.setHealth(100);
        this.setStamina(60);
        this.setSpeed(20);
        this.setAttackPower(5);
        this.jurisdiction = jurisdiction;
    }

    public void arrest(BaseClass player){
        System.out.println("Stop! " + player.getName() + ", you are under arrest!");
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public static void main(String[] args) {
        Constable gordon = new Constable("Gordon", "Gotham City");
        Farmer randy = new Farmer("Randy");

        gordon.arrest(randy);

    }
}
