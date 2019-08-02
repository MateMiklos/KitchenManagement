package com.codecool.kitchen;

public class KitchenHelper extends Employee {

    private int numberOfCarrots;
    private int numberOfPotatoes;
    private int numberOfMeat;

    public KitchenHelper() {
        this.numberOfCarrots = Kitchen.dealIngredients();
        this.numberOfPotatoes = Kitchen.dealIngredients();
        this.numberOfMeat = Kitchen.dealIngredients();
        Kitchen.kitchenHelpers.add(this);
    }

    public void shout() {
        System.out.println("We are all out!");
    }

    public int getNumberOfCarrots() {
        return numberOfCarrots;
    }

    public int getNumberOfPotatoes() {
        return numberOfPotatoes;
    }

    public int getNumberOfMeat() {
        return numberOfMeat;
    }

    public void giveCarrot() {
        this.numberOfCarrots -= 1;
    }
}
