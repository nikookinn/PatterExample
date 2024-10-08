
package com.example.bpfp.util;



import com.example.bpfp.model.Ingredient;

import java.util.List;

public class CalculateMealPrice {

    public static double calculatePriceForMeal(List<Ingredient> ingredients) {
        return ingredients.stream()
                .mapToDouble(ingredient -> ingredient.getQuantity() * ingredient.getUnitPrice())
                .sum();
    }
}
