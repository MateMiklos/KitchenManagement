package com.codecool.kitchen;

import java.util.ArrayList;
import java.util.List;

public abstract class Kitchen {

    static List<KitchenHelper> kitchenHelpers = new ArrayList<>();

    static int dealIngredients() {
        return (int)(Math.random() * 3);
    }

    public static void takeIngredient(String ingredientType) {
        if (ingredientType.equals("carrot")) {

        }
    }


    
}
