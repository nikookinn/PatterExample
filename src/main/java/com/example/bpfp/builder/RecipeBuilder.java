
package com.example.bpfp.builder;
import com.example.bpfp.model.CookingStep;
import com.example.bpfp.model.Ingredient;
import com.example.bpfp.model.Recipe;
import com.example.bpfp.util.CalculateMealPrice;


import java.util.List;

public class RecipeBuilder implements Builder {
    private  String name;
    private  List<Ingredient> ingredients;
    private  List<CookingStep> steps;

    public void setName(String name) {
        this.name = name;
    }


    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setSteps(List<CookingStep> steps) {
        this.steps = steps;
    }

    public Recipe getResult(){
        return new Recipe(name, CalculateMealPrice.calculatePriceForMeal(ingredients), ingredients, steps);
    }
}
