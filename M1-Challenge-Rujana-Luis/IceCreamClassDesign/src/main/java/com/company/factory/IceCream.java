package com.company.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class IceCream {
    private String flavor;
    private int caloriesPerContainer;
    private int caloriesPerServing;
    private ArrayList<String> ingredients;
    private int servingsPerContainer;
    private boolean isVegan;

    public IceCream(String flavor, int caloriesPerContainer, int caloriesPerServing, ArrayList<String> ingredients, int servingsPerContainer, boolean isVegan) {
        this.flavor = flavor;
        this.caloriesPerContainer = caloriesPerContainer;
        this.caloriesPerServing = caloriesPerServing;
        this.ingredients = ingredients;
        this.servingsPerContainer = servingsPerContainer;
        this.isVegan = isVegan;
    }

    public int getTotalCaloriesPerServing(int numberOfServings){
        return numberOfServings * getCaloriesPerServing();
    }

    public boolean checkIfItHasSugar(){
        for(String ingredient : this.ingredients){
            if(ingredient == "Corn Syrup" || ingredient == "Sugar"){
                return true;
            }
        }
        return false;
    }

    public void verifyVegan(){
        for(String ingredient : this.ingredients){
            if(ingredient == "Eggs" || ingredient == "Milk"){
                this.setVegan(false);
            }
        }
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getCaloriesPerContainer() {
        return caloriesPerContainer;
    }

    public void setCaloriesPerContainer(int caloriesPerContainer) {
        this.caloriesPerContainer = caloriesPerContainer;
    }

    public int getCaloriesPerServing() {
        return caloriesPerServing;
    }

    public void setCaloriesPerServing(int caloriesPerServing) {
        this.caloriesPerServing = caloriesPerServing;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public int getServingsPerContainer() {
        return servingsPerContainer;
    }

    public void setServingsPerContainer(int servingsPerContainer) {
        this.servingsPerContainer = servingsPerContainer;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return caloriesPerContainer == iceCream.caloriesPerContainer && caloriesPerServing == iceCream.caloriesPerServing && servingsPerContainer == iceCream.servingsPerContainer && isVegan == iceCream.isVegan && Objects.equals(flavor, iceCream.flavor) && Objects.equals(ingredients, iceCream.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, caloriesPerContainer, caloriesPerServing, ingredients, servingsPerContainer, isVegan);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", caloriesPerContainer=" + caloriesPerContainer +
                ", caloriesPerServing=" + caloriesPerServing +
                ", ingredients=" + ingredients +
                ", servingsPerContainer=" + servingsPerContainer +
                ", isVegan=" + isVegan +
                '}';
    }

    public static void main(String[] args) {
        IceCream pintOne = new IceCream("Chocolate", 1110, 370, new ArrayList<>(Arrays.asList("" +
                "Cocoa",
                "Milk",
                "Eggs",
                "Sugar")), 3, true);

        System.out.println(pintOne);
        System.out.println(pintOne.checkIfItHasSugar());
        pintOne.verifyVegan();
        System.out.println(pintOne);

    }
}
