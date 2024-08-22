package org.example.com.builder;
import org.example.com.model.CookingStep;
import org.example.com.model.Ingredient;
import org.example.com.model.Recipe;
import org.example.com.util.CalculateMealPrice;

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
