package com.company;

import java.util.Objects;

public class BaseClass {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    public BaseClass(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    public BaseClass(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println(this.name + "is running at " + this.speed + " miles per hour!");
        this.decreaseStamina(2);
    }

    public void attack(BaseClass opponent){
        System.out.println(this.name + "is attacking " + opponent.getName() + "!");
        opponent.decreaseHealth(this.getAttackPower());
        this.decreaseStamina(5);
    }

    public void heal(){
        System.out.println(this.name + "is healing!");
        this.setHealth(this.getHealth() + 5);
        this.increaseStamina();
    }

    public void decreaseHealth(int damageInflicted){
        System.out.println(this.name + " lost health!");
        this.setHealth(this.getHealth() - damageInflicted);
    }

    public void increaseStamina(){
        System.out.println(this.name + " is resting - stamina increasing!");
        this.setStamina(this.getStamina() + 3);
    }

    public void decreaseStamina(int activityEffort){
        this.setStamina(this.getStamina() - activityEffort);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseClass baseClass = (BaseClass) o;
        return strength == baseClass.strength && health == baseClass.health && stamina == baseClass.stamina && speed == baseClass.speed && attackPower == baseClass.attackPower && Objects.equals(name, baseClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, health, stamina, speed, attackPower);
    }

    @Override
    public String toString() {
        return "BaseClass{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                '}';
    }
}
