package com.example.bpfp.model;

import java.util.List;

public class Recipe {
    private final String name;
    private final Double price;
    private final List<Ingredient> ingredients;
    private final List<CookingStep> steps;

    public Recipe(String name, Double price, List<Ingredient> ingredients, List<CookingStep> cookingSteps) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.steps = cookingSteps;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public List<CookingStep> getCookingSteps() {
        return steps;
    }

}
