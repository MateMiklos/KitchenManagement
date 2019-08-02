package com.codecool.kitchen;

public class Chef extends Employee {

    private boolean hasKnifeSet;

    public Chef() {

    }

    public void cook() {

    }

    public void yell() {
        askForIngredient("carrot");
    }

    public void askForIngredient(String askedIngredient) {
        if (askedIngredient.equals("carrot")) {
            for (KitchenHelper kitchenHelper : ) {

            }
        } else if (askedIngredient.equals("potato")) {

        } else if (askedIngredient.equals("meat")) {

        }
    }
}
