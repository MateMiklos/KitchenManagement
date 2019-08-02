package com.codecool.kitchen;

public class Chef extends Employee {

    public static boolean exist = false;
    private boolean hasKnifeSet;

    public Chef() {
        if (!exist) {
            exist = true;

        }

    }

    public void cook() {

    }

    public void askForIngredient(String askedIngredient) {

        if (askedIngredient.equals("carrot")) {
            for (KitchenHelper kitchenHelper : Kitchen.kitchenHelpers) {
                if (kitchenHelper.getNumberOfCarrots() > 0) {
                    kitchenHelper.giveCarrot();
                    break;
                } else {
                    kitchenHelper.shout();
                }
            }
        }

        else if (askedIngredient.equals("potato")) {
            for (KitchenHelper kitchenHelper : Kitchen.kitchenHelpers) {
                if (kitchenHelper.getNumberOfPotatoes() > 0) {
                    kitchenHelper.givePotato();
                    break;
                } else {
                    kitchenHelper.shout();
                }
            }
        }

        else if (askedIngredient.equals("meat")) {
            for (KitchenHelper kitchenHelper : Kitchen.kitchenHelpers) {
                if (kitchenHelper.getNumberOfMeat() > 0) {
                    kitchenHelper.giveMeat();
                    break;
                } else {
                    kitchenHelper.shout();
                }
            }
        }
    }
}
