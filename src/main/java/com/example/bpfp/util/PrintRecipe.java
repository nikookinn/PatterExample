
package com.example.bpfp.util;


import com.example.bpfp.model.CookingStep;
import com.example.bpfp.model.Ingredient;
import com.example.bpfp.model.Recipe;


public class PrintRecipe {

    public static void print(Recipe recipe){

        StringBuilder sb = new StringBuilder();
        sb.append("Recipe: ").append(recipe.getName()).append("\n");
        sb.append("Ingredients:\n");
        for (Ingredient ingredient : recipe.getIngredients()) {
            sb.append(" - ").append(ingredient).append("\n");
        }
        sb.append("Steps:\n");
        for (CookingStep step : recipe.getCookingSteps()) {
            sb.append(" - ").append(step).append("\n");
        }
        System.out.println(sb.toString());
    }
}
