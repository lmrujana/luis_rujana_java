package com.company.store;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class IceCream {
    private String flavor;
    private int numberScoops;
    private boolean isCone;
    private ArrayList<String> toppings;

    public IceCream(String flavor, int numberScoops, boolean isCone, ArrayList<String> toppings) {
        this.flavor = flavor;
        this.numberScoops = numberScoops;
        this.isCone = isCone;
        this.toppings = toppings;
    }

    public IceCream(String flavor, int numberScoops) {
        this.flavor = flavor;
        this.numberScoops = numberScoops;
    }

    public void addCone(){
        if(!this.isCone){
           setCone(true);
        }
    }

    public void addScoops(int additionalScoops){
        this.setNumberScoops(this.getNumberScoops() + additionalScoops);
    }

    public void addToppings(String topping){
        toppings.add(topping);
    }

    public double getPrice(double pricePerScoop, double conePrice, double pricePerTopping){
        int totalToppings = toppings.size();

        if(isCone){
            return (pricePerScoop * this.numberScoops) + conePrice + (totalToppings * pricePerTopping);
        } else {
            return (pricePerScoop * this.numberScoops) + (totalToppings * pricePerTopping);
        }
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getNumberScoops() {
        return numberScoops;
    }

    public void setNumberScoops(int numberScoops) {
        this.numberScoops = numberScoops;
    }

    public boolean isCone() {
        return isCone;
    }

    public void setCone(boolean cone) {
        isCone = cone;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return numberScoops == iceCream.numberScoops && isCone == iceCream.isCone && Objects.equals(flavor, iceCream.flavor) && Objects.equals(toppings, iceCream.toppings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, numberScoops, isCone, toppings);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", numberScoops=" + numberScoops +
                ", isCone=" + isCone +
                ", toppings=" + toppings +
                '}';
    }

    public static void main(String[] args) {
        IceCream orderOne = new IceCream("Vanilla", 2, false, new ArrayList<>(Arrays.asList(
                "Chocolate Chips",
                "Strawberries"
        )));

        System.out.println(orderOne);
        orderOne.addCone();
        System.out.println(orderOne);
        orderOne.addScoops(3);
        System.out.println(orderOne);
        orderOne.addToppings("Bananas");
        System.out.println(orderOne);
        System.out.println(orderOne.getPrice(1,2,0.5));

    }
}
