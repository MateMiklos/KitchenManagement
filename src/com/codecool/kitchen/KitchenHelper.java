package com.codecool.kitchen;

import java.util.ArrayList;
import java.util.List;

public class KitchenHelper extends Employee {

    private int numberOfCarrots;
    private int numberOfPotatoes;
    private int numberOfMeat;

    public List<KitchenHelper> kitchenHelpers = new ArrayList<>();

    public KitchenHelper() {
        this.numberOfCarrots = KitchenMethodologies.dealIngredients();
        this.numberOfPotatoes = KitchenMethodologies.dealIngredients();
        this.numberOfMeat = KitchenMethodologies.dealIngredients();
        kitchenHelpers.add(this);
    }
}
